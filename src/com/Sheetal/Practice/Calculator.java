package com.Sheetal.Practice;
class Calc{
    static int add (int a, int b){
        return a + b;
    }
    static double add (double a, double b){
        return a + b;
    }
    static int add (int a, int b, int c){
        return a + b +c;
    }
    static String add (String a, String b){
        return a + b;
    }


}

public class Calculator {
    static void main() {
        System.out.println(Calc.add(4,8));
        System.out.println(Calc.add(4.00,8.00));
        System.out.println(Calc.add(4,6,1));
        System.out.println(Calc.add("Hello ", "World"));
    }
}
