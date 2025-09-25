package com.Sheetal.Day_11;
import java.util.Arrays;
import java.util.Scanner;
public class Practice2 {
    // multidimesional arrays

    public static void main(String[] args) {
       /*int [][] matrix = {
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
    */

// Traversing the elements
      /* for (int i=0;i<matrix.length;i++){
           int[] row = matrix[i];
           for (int j=0;j<row.length;j++){
               System.out.println(row[j] + " ");
           }
           System.out.println();
       }*/

// scanning from the user
      /*  Scanner sc = new Scanner (System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter elements: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");    */
    /*    for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    */

// sum of elements of cols
       /* for (int j=0;j<col;j++){
            int sum =0;
            for (int i=0;i<row;i++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        } */

// diagnol elements sum
       /* int sum =0;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(i==j){
                    sum+= arr[i][j];
                }
            }
        }
        System.out.println(sum);
       */

// transpose of the matrix
       /* int[][] transpose = new int [row][col];
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                transpose[i][j] = arr[j][i];
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }   */

// Matrix Multiplication

        Scanner sc = new Scanner (System.in);

        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr1 = new int [p][q];
        for (int i=0; i<p; i++){
            for (int j=0; j<q; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int n = sc.nextInt();

        if (q != m){
            System.out.println("No multiplication possible");
            return;
        }
        int[][] arr2 = new int [p][q];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int[][] arr3 = new int [p][n];
        for (int i=0;i<p;i++){
            for (int j=0;j<n;j++){
                for (int k=0;k<q;k++){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for(int i=0;i<p;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr3[i][j]);
            }
            System.out.println();
        }

    }
}
