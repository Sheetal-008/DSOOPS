package com.Sheetal.S1lec58;

class arithmetic{
    static int add (int a, int b){
        return a + b;
    }

    static double add (double a, double b){
        return a + b;
    }
}


public class Overloading {
    static void main() {
        System.out.println(arithmetic.add(2,4));
        System.out.println(arithmetic.add(2.0, 5.0));
    }
}
