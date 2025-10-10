package com.Sheetal.Day_12;

class Car{
    public String make;
    public int year;
    private String brand;

    public String getBrand(){
        return brand;
    }

    public void printDetails(){
        System.out.println("Make" + make);
        System.out.println("Year" + year);
    }
}

public class Revision{
    public static void main(String[] args){
        Car c = new Car();
        c.make = "Audi";
        c.year = 2020;
        c.printDetails();
        System.out.println(c.getBrand());
    }
}