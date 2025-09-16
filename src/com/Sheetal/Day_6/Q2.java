package com.Sheetal.Day_6;
import java.util.Scanner;
import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the values: ");
        int[] arr = new int[5];
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
