package me.finck.and_project;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import me.finck.and_project.local_storage.Books;
import me.finck.and_project.local_storage.BooksDao;
import me.finck.and_project.local_storage.BooksDatabase;
public class BookRepository {
    private static BookRepository instance;
    private final BooksDao booksDao;
    private final LiveData<List<Books>> allBooks;
    private final ExecutorService executorService;


    private BookRepository(Application application) {
        BooksDatabase database = BooksDatabase.getInstance(application);
        booksDao = database.booksDao();
        allBooks = booksDao.getAllBooks();
        executorService = Executors.newFixedThreadPool(2);

        }
        public static synchronized BookRepository getInstance (Application application) {
            if (instance == null)
                instance = new BookRepository(application);
            return instance;
        }
        public LiveData<List<Books>>getAllBooks(){
        return allBooks;
    }
    public void insert(Books books){
        executorService.execute(()->booksDao.insert(books));
    }
    public void deleteAllBooks(){
        executorService.execute(booksDao::deleteAllBooks);
    }
}