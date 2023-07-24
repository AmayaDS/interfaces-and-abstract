/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab02_721426276;

/**
 *
 * @author hp
 */
//creating the abstract class
public abstract class Book implements LibraryItem{
    private String title;
    private String author;
    private boolean checkedOut;
    
    //constructor
    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }
    //getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    
    //overriding the methods
    
    public void checkOut(){
        checkedOut = true;
    }
    
    public void checkIn(){
        checkedOut = false;
    }
    
    public boolean isCheckedOut(){
        return checkedOut;
    }
}

