package library_manage;

import java.util.ArrayList;
import library_manage.Book;

public class LibraryManager {
    private ArrayList<Book> books;

    public LibraryManager() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book searchBook(String id) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public boolean deleteBook(String id) {
        Book b = searchBook(id);
        if (b != null) {
            books.remove(b);
            return true;
        }
        return false;
    }

    public void report() {
        System.out.println("=== Library Report ===");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> getBooks() {
        return books; // For testing
    }
}
