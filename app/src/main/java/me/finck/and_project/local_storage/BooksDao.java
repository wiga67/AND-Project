package me.finck.and_project.local_storage;

import androidx.lifecycle.LiveData;
import androidx.room.*;

import java.util.List;

@Dao
public interface BooksDao {
    @Insert
    void insert(Books books);

    @Update
    void update(Books books);

    @Delete
    void delete(Books books);

    @Query("DELETE FROM books_table")
    void deleteAllBooks();

    @Query("SELECT * FROM books_table")
    LiveData<List<Books>> getAllBooks();




}
