/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library_manage;
import java.util.Scanner;
/**
 *
 * 
 */
public class LibraryApp {

    /**
     * 
     * 
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManager manager = new LibraryManager();
        int choice;
        do{
            System.out.println("/////== Library Management ==/////");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Print Report");
            System.out.println("5. EXIT");
            System.out.println("Enter choice");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice){
            case 1:
            System.out.println("Enter Book ID: ");
            String id = sc.nextLine();
            System.out.println("Enter Title: ");
            String title = sc.nextLine();
            System.out.println("Enter Author: ");
            String author =sc.nextLine();
            System.out.println("Book successfully saved.Yayy!!!!!");
            manager.addBook(new Book(id, title, author));
            break;
            
            case 2:
                System.out.println("Enter Book ID to search");
                String sid = sc.nextLine();
                Book found = manager.searchBook(sid);
                if(found != null){
                    System.out.println("Found: " + found);
                }else{
                    System.out.println("Book not found");
                }
                break;
                
            case 3: 
                System.out.println("Enter Book ID to delete");
                String did = sc.nextLine();
                if(manager.deleteBook(did)){
                   System.out.println("Book deleted");
                }else{
                    System.out.println("Book not deleted");
                    
                }
            
            break;
            case 4:
                manager.report();
                break;
                
            case 5:
                System.out.println("Exiting...");
                break;
                
            default:
                System.out.println("Invalid choice.");
            
            
          }  
            
     }while (choice != 5);
        sc.close();
            
            
        
        }
}
    