package com.Sheetal.Day_6;
import java.util.Arrays;
public class Q1 {
    public static void main(String[] args) {
        int pos = 2;
        int value = 25;
        int[] arr = {1,2,3,4,5,0};

        for(int i = arr.length-1;i>pos;i--){
            arr[i] = arr[i-1];
        }

        arr[pos] = value;

        System.out.println(Arrays.toString(arr));
    }
}
