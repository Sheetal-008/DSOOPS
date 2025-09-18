package com.Sheetal.Day_5;
import java.util.Scanner;
public class Q9 {
    // staircase pyramid
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        int len = word.length();
        for(int i = 0;i<len;i++){
            for (int j = i;j<len;j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
    }
}
