package me.finck.and_project.local_storage;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "books_table")
public class Books {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String author;
    private String description;
    private String series;
    private String editor;
    private int publishing_years;

    public Books(String title, String author, String description, String series, String editor, int publishing_years) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.series = series;
        this.editor = editor;
        this.publishing_years = publishing_years;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getPublishing_years() {
        return publishing_years;
    }

    public void setPublishing_years(int publishing_years) {
        this.publishing_years = publishing_years;
    }
}
