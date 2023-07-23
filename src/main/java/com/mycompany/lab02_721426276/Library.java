/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_721426276;

/**
 *
 * @author hp
 */
//concrete class
//creating a book array
public class Library{
    private Book[] books;
    private int numOfBooks;
    
    //methods
    public void addBook(Book book){
        if(numOfBooks < books.length){
            books[numOfBooks] = book;
            numOfBooks++;
        }else{
            System.out.println("Array is full");
        }
    }
    
    public void findBookByTitle(String title){
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
        }
    }
    
    return null;
    }
    
    public void findBookByAuthor(String author) {
        for (int i = 0; i < numOfBooks; i++) {
            if (books[i].getAuthor().equals(author)) {
                return books[i];
            }
        }
     return null;
    }
}
