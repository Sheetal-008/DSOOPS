package com.Sheetal.Day_7;
import java.util.Arrays;
public class Q2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {9,6,78,53},
                {34,33,53,86}
        };

        for(int i = 0;i<arr.length;i++) {
            int largest = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (largest < arr[i][j]) {
                    largest = arr[i][j];
                }
            }
            System.out.println("The largest element in row " + i + ": " + largest);
        }
    }
}
