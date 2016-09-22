/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import sources.Book;
import sources.BookStore;

/**
 *
 * @author el cacas
 */
public class TestBookStore {
    public static void main(String[] args) {
        Book hobbit = new Book("The hobbit", "J.R.R Tolkien", 200);
        Book hyperion = new Book("Hyperion", "Dan Simmons", 300);
        Book fundacion = new Book("Fundacion", "Isaac Asimov", 120);
        BookStore bookstore = new BookStore();
        bookstore.addBook(hobbit);
        bookstore.addBook(hyperion);
        bookstore.addBook(fundacion);
        bookstore.showBooks();
        bookstore.modifyBook(1, "Requiem",300.2f,"No me lo se");
        bookstore.showBooks();
        bookstore.removeBook(1);
        bookstore.showBooks();
        
    }
}
