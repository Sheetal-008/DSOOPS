package com.Sheetal.Day_9;

import java.util.Arrays;

public class TwoDimensional {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int product = 1;
        for(int i=0;i<arr.length;i++){
            product *= arr[i][i];
        }
        for (int i=0;i<arr.length;i++){
            arr[i][i] = product;
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
