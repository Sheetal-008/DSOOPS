package com.Sheetal.Day_8;

import java.util.Arrays;
import java.util.Scanner;

public class Cache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter the size:");
        size = sc.nextInt();
        String[] cache = new String[5];

        int next = 0;
        for (int i = 0; i < size; i++) {
            cache[next] = sc.next();
            next = (next + 1) % cache.length;
        }
        System.out.println(Arrays.toString(cache));

    }
}



/*
       if (size == next){
            for (int i=0;i<next;i++){
                   cache[i] = cache[i-1];
            }
        }
        */
