package com.Sheetal.ClassesObjects;
    class Person{
        public String name;
        private int age;
        protected String address;

        public Person(String n, int a, String addr){
            name = n;
            age = a;
            address = addr;
        }
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        public int getAge(){
            return age;
        }
    }
public class Basics {
        public static void main(String[] args) {
            Person p = new Person("Rita", 22, "Delhi");
            p.displayInfo();
            System.out.println(p.getAge());
        }
    }

