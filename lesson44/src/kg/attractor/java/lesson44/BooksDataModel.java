package kg.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class BooksDataModel {
    private List<Book> books = new ArrayList<>();

    public BooksDataModel() {
        books.add(new Book(1, "Java: The Complete Reference", "Herbert Schildt", "images/1.jpg", "AVAILABLE"));
        books.add(new Book(2, "First Code", "Robert Martin", "images/1.jpg", "BORROWED"));
        books.add(new Book(3, "Effective Java", "Joshua Bloch", "images/1.jpg", "AVAILABLE"));
        books.add(new Book(4, "Head First Java", "Kathy Sierra", "images/1.jpg", "AVAILABLE"));
        books.add(new Book(5, "Design Patterns", "Erich Gamma", "images/1.jpg", "AVAILABLE"));
        books.add(new Book(6, "The Pragmatic Programmer", "Andrew Hunt", "1.jpg", "BORROWED"));
    }

    public List<Book> getBooks() {
        return books;
    }
}

