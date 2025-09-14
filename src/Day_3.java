import java.util.Scanner;
public class Day_3 {
// Q1.
        public static void main(String[] args) {
            int num = 7; // test number

            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }

// Q2.
    /*for (int i = 0; i < 3; i++) {
        if (i == 1) continue;
        System.out.print(i + " ");
    }*/


// Q3.
    /*while loop → condition is checked before execution. (entry-controlled)
    do-while loop → condition is checked after execution. (exit-controlled) */

// Q4.

           /* public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks (0-100): ");
            int marks = sc.nextInt();

            // Using if-else
            if (marks >= 90) {
                System.out.println("Grade: A (Excellent)");
            } else if (marks >= 75) {
                System.out.println("Grade: B (Good)");
            } else if (marks >= 50) {
                System.out.println("Grade: C (Average)");
            } else {
                System.out.println("Grade: D (Fail)");
            }

            // Using switch with ranges
            switch (marks / 10) {
                case 10: case 9:
                    System.out.println("Switch: Excellent");
                    break;
                case 8: case 7:
                    System.out.println("Switch: Good");
                    break;
                case 6: case 5:
                    System.out.println("Switch: Average");
                    break;
                default:
                    System.out.println("Switch: Fail");
            }

            sc.close();
            return;
        }*/
    }




