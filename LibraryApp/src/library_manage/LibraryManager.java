/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_manage;
import java.util.ArrayList;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */


public class LibraryManager {
    private ArrayList<Book> books;
    private static final String FILE_NAME = "books.json";
    

    public LibraryManager() {
        books = loadBooks();
    }

    public void addBook(Book book) {
        books.add(book);
        saveBooks();
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
            saveBooks();
            return true;
        }
        return false;
    }

    public void report() {
        System.out.println("=== Library Report ===");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    // Save to JSON file
    private void saveBooks() {
        try (Writer writer = new FileWriter(FILE_NAME)) {
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Load from JSON file
    private ArrayList<Book> loadBooks() {
        try (Reader reader = new FileReader(FILE_NAME)) {
          
        } catch (IOException e) {
            return new ArrayList<>();
        }
        return null;
    }
}
