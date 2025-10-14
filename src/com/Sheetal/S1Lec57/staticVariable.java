package com.Sheetal.S1Lec57;

import jdk.dynalink.beans.StaticClass;

public class staticVariable {

    String authorName;
    String bookName;
    static String seller = "Sheetal";

    staticVariable(String authorName, String bookName){
        this.authorName = authorName;
        this.bookName = bookName;
    }
    public static void main(String[] args) {
        staticVariable b1 = new staticVariable("Charles Dickens", "Great Expectations");
        System.out.println("The author name is " + b1.authorName + " and the book is " + b1.bookName + " sold by " + seller); // without using the class name, the static variable is called
    }
}

class buyer {
    public static void main(String[] args) {

        System.out.println("The book is being sold by " + staticVariable.seller);
    }
}
