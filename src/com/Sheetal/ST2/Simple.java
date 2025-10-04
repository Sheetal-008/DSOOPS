package com.Sheetal.ST2;


public class Simple{
    static int reverse(int n){
        int rev =0;

        while(n>0) {

            rev = rev * 10 + n % 10;
            n = n / 10;
        }
    return rev;
}
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0;i<args.length;i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println(sum);


        int num = 1234;
        int count = 0;
        while (num>0){
            num = num/10;
            count++;
        }
        System.out.println(count);

        int n = 123;
        System.out.println("Reversed number is : " + reverse(n));

    }
}