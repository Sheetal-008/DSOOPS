package com.Sheetal.Day_2;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Assignment operations: ");
        int a = 10;
        int b = 5;

        a += 3;
        b -= 2;
        a /= 2;
        b *= 3;
        b %= 4;

        System.out.println("a is: " + a + " b is: " + b);

        System.out.println();
        System.out.println("Relational operators: ");

        System.out.println("a==b : " + (a==b));
        System.out.println("a<b : " + (a<b));
        System.out.println("a>=6 : " + (a>=6));
        System.out.println("b>0 : " + (b>0));
        System.out.println("b<=9 : " + (b<=9));

        System.out.println();
        System.out.println("Logical Operation: ");
        boolean val1 = true;
        boolean val2 = false;

        System.out.println("(val1 && val2) : " + (val1 && val2));
        System.out.println("(val1 || val2) : " + (val1 || val2));
        System.out.println("(!val1) : " + (!val1));

        System.out.println();
        System.out.println("ternary operations: ");
        int num = 3;
        System.out.println((num%2==0)?"Even":"Odd");
    }
}
