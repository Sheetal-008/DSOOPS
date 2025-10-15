package com.Sheetal.Practice;

class Student {
    String name;
    int marks;
    int rollNo;
    static int totalstudents = 0;
    Student(int totalstudents){
        totalstudents ++;
    }
    public Student(String name, int marks, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        this. marks = marks;
        totalstudents ++;
    }
    void calculateGrade(int marks){
        if (marks >= 90) System.out.println("A");
        else if(marks >= 75) System.out.println("B");
        else if (marks >=50) System.out.println("C");
        else  System.out.println("F");

    }

}
public class StudentClass {
    static void main(String[] args) {
        Student s1 = new Student("Sheetal", 98, 21);
        Student s2 = new Student("Rekha", 97,2);
        System.out.println();
    }
}
