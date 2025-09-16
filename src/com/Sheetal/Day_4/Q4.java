package com.Sheetal.Day_4;
import java.util.Scanner;
public class Q4 {
    // rectangular pattern
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the rows and columns respectively: ");
        int rows = in.nextInt();
        int cols = in.nextInt();

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
