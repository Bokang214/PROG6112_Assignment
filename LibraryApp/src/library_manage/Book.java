/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_manage;

/**
 *
 * @author ACER
 */
public class Book extends Item {
    private String author;
    private boolean isBorrowed;
    
    public Book(String id, String title, String author){
        super(id, title);
        this.author = author;
        this.isBorrowed = false;
    }

    public String getAuthor() {return author; }
    public boolean isBorrowed() {return isBorrowed;}
    
    public void borrowBook() { isBorrowed = true;}
    public void returnBook() {isBorrowed = false;}
    
    @Override
    public String toString(){
        return super.toString() + ", Author: " + author + ", Borrowed: " + isBorrowed;
    }
}

