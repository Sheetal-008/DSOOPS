package com.Sheetal.ST2;
import java.io.*;
import java.lang.String;
import java.sql.SQLOutput;

class Student{
        String name;
        int roll;
        public Student(String n, int r){
            name =n; roll = r;
        }
        public String toString(){
            return "Student{name='" + name + "', roll=" + roll + "}";
        }
    }
public class Strings {
    public static void main() {
        /*String name = "Sheetal";
        System.out.println(name);
        name = "Sharma";
        System.out.println(name); */


// == checks if the reference variable is pointing to the same object or not.
    // a and b, both are pointing to the same object.
        String a = "Sheetal";
        String b = "Sheetal";
        System.out.println(a == b);

    // two different objects of same value are created outside the string pool in the heap.
        String name = new String("Kunal");
        String name1 = new String ("Kunal");
        System.out.println(name == name1);


    // .equals method : Just checks the value of the strings.
        System.out.println(name .equals(name1));

    // string array to char array
        String str = "Sheetal";
        char[] arr = str.toCharArray();
        System.out.println(arr);

    // Overriding toString method

        Student s = new Student ("Amiit", 101);
        System.out.println(s);

    // METHODS OF STRING CLASS
        String sr = "Kripanshu";
        System.out.println(sr.length());
        System.out.println(sr.charAt(1));
        System.out.println(sr.substring(0,2));
        System.out.println(sr.indexOf('a'));
        System.out.println(sr.toUpperCase());
        System.out.println(sr.toLowerCase());
        System.out.println(sr.equals("Kripanshu"));
        System.out.println(sr.concat(" Dhiman"));
        System.out.println(sr.replace('a','e'));
        System.out.println(sr.trim());  // trims the leading or trailing spaces
        System.out.println(sr.split(" , "));


    // StringBuffer and StringBuilder methods
        StringBuffer sb = new StringBuffer ("Sheetal");
        System.out.println(sb.replace(0,1,"R"));
        System.out.println(sb.reverse());
        sb.setCharAt(0, 'S');
        System.out.println(sb);


    }
}
