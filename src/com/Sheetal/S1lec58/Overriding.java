package com.Sheetal.S1lec58;

class Person{
    void role(){
        System.out.println("I am a good and kind person");
    }
}
class Sir extends Person{
    @Override
    void role(){
        System.out.println("Sir teaches good.");
    }
}
public class Overriding {
/*Method overloading/ Compile-time polymorphism : Order of parameters is different or the number of parameters is different
or data types are different in the two or more methods with sae name. */
    static void main() {
        Person p = new Sir();
        p.role();
    }
}
