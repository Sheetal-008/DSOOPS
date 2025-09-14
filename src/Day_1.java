// Q1.
/*Compiling in Java: The Java compiler (javac) converts the human-readable Java source code (.java file) into bytecode (.class file). This step checks for syntax errors and ensures the code follows Java rules.
Interpreting in Java: The Java Virtual Machine (JVM) interprets the bytecode and executes it line by line (or uses JIT compilation for optimization). This allows Java programs to run on any system that has a JVM, making Java platform-independent.*/

// Q2.
/*javac MyProgram.java
java MyProgram arg1 arg2 */

// Q3.
/* A Java program may expect a certain number of arguments, like 3 numbers to add.
If you provide fewer, the program won’t know what to do and may crash with an ArrayIndexOutOfBoundsException.
*/

// Q4.
public class Day_1{
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Please provide exactly three numbers.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int sum = num1 + num2 + num3;
        System.out.println("The sum is: " + sum);
    }
}
