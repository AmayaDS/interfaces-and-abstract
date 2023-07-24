/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_721426276;

/**
 *
 * @author hp
 */
public class LibraryManagementSystem{
    public static void main(String[] args) {
        
        //creating new objects
        Library library = new Library();
        
        //adding books to book the array
        //a subclass of book named Storybooks has been created seperately
        StoryBooks book = new StoryBooks("the book theif","Markus Zusak");
        //calling the addBook method
        library.addBook(book);
        
        //checkout a book
        book.checkOut();
        
        //calling methods to search books
        StoryBooks byTitle = library.findBookByTitle("the book theif");
        StoryBooks byAuthor = library.findBookByAuthor("markus zusak");
        
        //printing
        //checked out book
        System.out.println(book.checkOut() + "has been checked out.");
        
        //finding books
        System.out.println(library.findBookByTitle() + "found");
        System.out.println(library.findBookByAuthor() + "found");
        
    }
}
