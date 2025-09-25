package com.Sheetal.Day_11;
import java.util.Arrays;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {


// Scanning array from the user and traversing the array
       /* Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }*/

       /* Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }*/

// Insertion
       /* int pos = sc.nextInt();
        int value = 25;
        for (int i=n;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        n++;

        System.out.println(Arrays.toString(arr)); */

// deletion
       /* int pos2 = sc.nextInt();
        for (int i=pos2;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        n-- ;
        for (int i=0;i<n;i++){
            if(arr[i] != 6) {
                System.out.print(arr[i] + " ");
            }
        } */

// Sum of elements
       /* int sum = 0;
        for (int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println("Sum of all the elements is: " + sum);
        */


// maximum element
        /*int max = 0;
        for (int i=0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element is:" + max);
        */


// Reverse the elements of an array

        /*for (int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
         */

// Remove duplicates from the sorted array
        /*int j =0;
        for (int i=0;i<n-1;i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        System.out.println(Arrays.toString(Arrays.copyOf(arr,j)));
        */

// rotate the array by k shifts
        /*int k = sc.nextInt();
        k = k % n;
        int[] rotated = new int[n];
        for (int i=0;i<n;i++){
            rotated[i] = arr[(i+k) % n];
        }

        System.out.println(Arrays.toString(rotated));
       */

// merge two sorted arrays into third
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6,7,10};
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];
        int i=0, j=0, k=0;
        while(i<n1 && j<n2){
            if (arr1[i] < arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            merged[k++] = arr1[i++];
        }
        while (j < n2) {
            merged[k++] = arr2[j++];
        }

        System.out.println("Merged Array: " + Arrays.toString(merged));
    }
}
