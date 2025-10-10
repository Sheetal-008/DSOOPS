package com.Sheetal.ClassesObjects;

public class ClassObject {
    // class is a collection of objects
    // Object Class Methods
    //Method	Description
    //getClass()	Returns runtime class of object
    //hashCode()	Returns hash value of object
    //equals(Object obj)	Compares two objects for equality
    //clone()	Creates a copy of object
    //toString()	Returns string form of object
    //finalize()	Called before object destruction
    //wait()	Causes thread to wait
    //wait(long timeout)	Waits for a specific time
    //wait(long timeout, int nanos)	Waits with nanoseconds precision
    //notify()	Wakes up one waiting thread
    //notifyAll()	Wakes up all waiting threads

    // toString: It is a predefined method present in object class.

    String brand;
    public ClassObject(String brand){
        this.brand = brand;
    }

   /*@Override
        public String toString(){
            return "Vehicle2020";
        }*/


    public static void main(String[] args) {
        ClassObject c = new ClassObject("BMW");
        System.out.println(c.hashCode());
        // If you don't override hashCode(), it returns the value of the object's memory address.
        // If you don't override toString(), it returns
        System.out.println(c);

        // Wrapper class--> It converts the primitive data type to non primitive data type
        int a = 10;
        Integer b = (Integer) a;
        Integer d = Integer.valueOf(a);
        Integer e = new Integer(a);
        Integer f = a;
        System.out.println(a);
        System.out.println(b);

        Integer x = 1000;
        Integer y = 1000;
        Integer z = Integer.valueOf(x);
        System.out.println(x == y);
        System.out.println(x.equals(y));

        Integer[] arr = {1,2,3,4,5,6};
        int count =0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                count ++;
            }

        }
        System.out.println(count);

    }
}
