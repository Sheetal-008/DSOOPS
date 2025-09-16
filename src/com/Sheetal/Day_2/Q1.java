package com.Sheetal.Day_2;

public class Q1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        char ch = '+';

        if (ch == '+') {
            System.out.println(a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
            } else {
                System.out.println(a / b);
            }
        } else if (ch == '%') {
            System.out.println(a % b);
        }
    }
}
