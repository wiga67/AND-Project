package me.finck.and_project;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

import me.finck.and_project.local_storage.Books;

public class BookViewModel extends AndroidViewModel {
    private BookRepository repository;

    public BookViewModel(@NonNull @NotNull Application application) {
        super(application);
        repository = BookRepository.getInstance(application);
    }
    public LiveData<List<Books>> getAllBooks()
    {
        return repository.getAllBooks();
    }
    public void insert(final Books books){
        repository.insert(books);
    }
    public void deleteAllBooks(){
        repository.deleteAllBooks();
    }

}
