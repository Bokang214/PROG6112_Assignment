/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library_manage;

/**
 *
 * @author ACER
 */
public class Item {
    private String id;
    private String title;
    
    public Item(String id, String title){
        this.id = id;
        this.title = title;
        
    }
    public String getId() {return id;}
    public String getTitle(){return title;}
    
    public void setTitle(String title) {this.title = title;}
    
    @Override
    public String toString(){
        return "ID: " + id + ", Title: " + title;
    }
}
