package com.Sheetal.Day_9;
import java.util.Scanner;
public class BinarySearch {
    public int binarysearch(int[] arr, int left, int right, int target){
        if(left> right) return -1;
        int mid = (left + right) / 2;
        if (arr[mid] == target){
            return mid;
        }
        else if (arr[mid] > target){
            return binarysearch(arr, left, mid-1,target);
        }
        return binarysearch(arr, mid+1,right,target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target:");
        int n = sc.nextInt();

    }
}
