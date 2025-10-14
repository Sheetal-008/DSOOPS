package com.Sheetal.S1Lec57;

public class Book {
    static int totalBooks = 2;
    String title;

    Book(String title) {
        this.title = title;
    }

    static void main(String[] args) {
        Book b1 = new Book("The Alchemist");
        Book b2 = new Book("Notes from the Underground");
        System.out.println(totalBooks);
        System.out.println("The titles of the books are: " + b1.title + " and " + b2.title);
    }
}


// Lifetime of a class variable is till the class presence.
// Lifetime of an instance variable is till the presence of the object.