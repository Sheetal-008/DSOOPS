package com.Sheetal.Day_3;
//Explain the difference between while and do-while loops with code
//examples.

// Answer the while loop firstly checks the condition and then executes the block of code
// Do-while loop executes the code once and then check the condition for executing further
public class Q1 {
    public static void main(String[] args) {
        System.out.println("While loop: ");
        int i = 5;
        while(i<4){
            System.out.println("Hello world");
        }

        System.out.println();
        System.out.println("Do-While: ");
        do{
            System.out.println("Hello world");
        }while (i<4);
    }
}
