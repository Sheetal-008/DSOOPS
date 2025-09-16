package com.Sheetal.Day_4;

public class Q3 {
    // pyramid pattern
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(j<(n-i-1)){
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
