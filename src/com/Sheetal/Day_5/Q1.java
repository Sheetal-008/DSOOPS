package com.Sheetal.Day_5;
import java.util.Scanner;
public class Q1 {
    // diamond shape
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = n;j>i;j--){
                System.out.print(" ");
            }
            for(int k = 1;k<=i*2-1;k++){
                System.out.print('*');
            }
            System.out.println();
        }

        for(int i = 1;i<n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }

            for (int k = (n-i)*2-1;k>0;k--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
