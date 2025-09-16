package com.Sheetal.Day_7;
import java.util.Arrays;
public class Q4 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {9,6,78,53},
                {56,86,23,90},
                {86,23,89,64}
        };

        for(int i = 0;i<arr.length;i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("The sum of elements in each row " + i + ": " + sum);
        }
    }
}
