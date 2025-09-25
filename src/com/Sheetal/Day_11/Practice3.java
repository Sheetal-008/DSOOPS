package com.Sheetal.Day_11;
import java.util.Scanner;

public class Practice3 {

    static int fibb(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibb(n-1) + fibb(n-2);
    }

    static int factorial(int n){
        if(n==0 || n==1 ) return 1;
        return n* factorial(n-1);
    }
    static int sum(int n){
        int sum = 0;
        if(n==0) return 1;
        return sum+ sum(n-1);
    }
// Control Statements
    public static void main(String[] args){

// prints 1 to 10
     /*   for (int i=1;i<=10;i++){
            System.out.print(i + " ");
        }
      */

// print 1 to 20
       /* int i = 1 ;
        while(i<=20){
            System.out.print(i + " ");
            i++ ;
        }
    */


// prints first 10 fibbonacci numbers
    /*    int first = 0, second = 1;
        for (int i=0;i<10;i++){
            System.out.println(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    */


// multiplication table
        /*for (int i=1;i<=10;i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
            System.out.println();
        }*/

// a square of 4 rows and 4 columns of `*`.
        /*for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

// print numbers from 5 to 1 in reverse order,
      /*  for (int i=5;i>=1;i--){
            System.out.println(i);
        }   */


//a right triangle of 5 rows using `*`

       /* for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  */

// inverted triangle
       /* for (int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }     */

// an equilateral triangle
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /* for (int i=1;i<=n;i++){
            for (int sp= i;sp<n;sp++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }   */


// a pyramid triangle

   /*     for (int i=1;i<=3;i++){
            for (int sp=i;sp<3;sp++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*i - 1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }     */

// inverted pyramid
        /*for (int i=n ;i>=1;i--){
            for (int sp=0;sp<n-i;sp++){
                System.out.print(" ");
            }
            for (int j=1; j<2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } */

// diamond shape
        /*for (int i=1;i<=n;i++){
            for (int sp=i;sp<n;sp++){
                System.out.print(" ");
            }
            for (int j=1; j<= 2*i -1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for (int sp=0;sp<n-i;sp++){
                System.out.print(" ");
            }
            for (int j=1; j<2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }    */


// Floyd's triangle
        /* int num = 1;
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }   */

// pattern
        /*for (int i=1;i<=n;i++){
            for (int j=i;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }*/

// pattern
        /*char ch= 'A';
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }*/

        System.out.println("The fibbonacci is " + fibb(n));
        System.out.println("The factorial is " + factorial(n));
        System.out.println(sum(n));
    }
}
