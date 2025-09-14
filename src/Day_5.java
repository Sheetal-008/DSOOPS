import java.util.Scanner;
public class Day_5 {
// Q1.
      /*  public static void main(String[] args) {
            for (int i = 1; i <= 30; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }*/

// Q2.
   /* public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i > 5) {
                System.out.println(i + " → High");
            } else {
                System.out.println(i + " → Low");
            }
            i++;
        }
    }*/

// Q3.

        /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= cols; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            sc.close();
        }*/

// Q4.

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows (N): ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {

                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            sc.close();
        }
    }





