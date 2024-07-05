package cz.engeto;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    public Book findBook(String title) {
        return books.get(title);
    }

    public void borrowBook(String title) {
        Book book = books.get(title);
        if (book != null && !book.isBorrowed()) {
            book.setBorrowed(true);
        }
    }

    public void returnBook(String title) {
        Book book = books.get(title);
        if (book != null && book.isBorrowed()) {
            book.setBorrowed(false);
        }
    }

}

class Book {
    private String title;
    private boolean isBorrowed;

    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}