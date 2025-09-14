public class Day_2 {
    // Q1.
    /* (1) Identifier must start with a letter, underscore (_), or dollar sign ($).It cannot start with a digit. */
    /* (2) Identifier cannot be a Java keyword.*/

    // Q2.
    /* (1) class → Used to declare a class.
            class Student {}
    (2) if → Used for conditional execution.
            if (age > 18) { ... }
    (3) return → Used to return a value from a method.
            return total; */

    // Q3.{
        public static void main(String[] args) {
            int a = 15, b = 4;

            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));

    // Q4.
            int x = 10, y = 20;

            // Assignment operator
            int z = x;  // Assign value of x to z
            System.out.println("Assignment: z = " + z);

            // Relational operators
            System.out.println("x == y : " + (x == y));
            System.out.println("x != y : " + (x != y));
            System.out.println("x > y  : " + (x > y));
            System.out.println("x < y  : " + (x < y));

            // Logical operators
            boolean cond1 = (x < y);
            boolean cond2 = (x > 5);
            System.out.println("cond1 && cond2 : " + (cond1 && cond2));
            System.out.println("cond1 || cond2 : " + (cond1 || cond2));
            System.out.println("!cond1 : " + (!cond1));

            // Ternary operator
            String result = (x > y) ? "x is greater" : "y is greater";
            System.out.println("Ternary result: " + result);
        }
    }



