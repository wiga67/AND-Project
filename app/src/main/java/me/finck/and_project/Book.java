package me.finck.and_project;

public class Book {
    private String bTitle;
    private String bAuthor;

    Book(String title, String author){
        bTitle = title;
        bAuthor = author;
    }

    public String getbTitle() {
        return bTitle;
    }

    public String getbAuthor() {
        return bAuthor;
    }
}
