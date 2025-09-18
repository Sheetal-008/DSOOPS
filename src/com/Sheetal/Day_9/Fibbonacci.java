package com.Sheetal.Day_9;

import java.util.Scanner;

public class Fibbonacci {
    static int fibb(int n){
        if(n==0) return 0;
        if (n==1) return 1;
        return fibb(n-1) + fibb(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter n:");
        n = sc.nextInt();
        System.out.println(Fibbonacci.fibb(n));
    }
}
