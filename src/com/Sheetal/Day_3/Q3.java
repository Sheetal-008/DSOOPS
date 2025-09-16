package com.Sheetal.Day_3;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = in.nextInt();
        System.out.println("If-else: ");
        if (marks >= 90 && marks <= 100) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Very Good");
        } else if (marks >= 50) {
            System.out.println("Pass");
        } else if (marks >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks entered!");
        }

        System.out.println();
        System.out.println("Switch statement: ");
        switch (marks / 10) {
            case 10:
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
            case 7:
                System.out.println("Very Good");
                break;
            case 6:
            case 5:
                System.out.println("Pass");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid marks entered!");
                break;
        }
    }
}
