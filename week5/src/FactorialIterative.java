import java.util.Scanner;

/* This program calculates the factorial of a positive integer. */
public class FactorialIterative {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = -1;

        // Check for a valid input
        while (n < 0) {
            System.out.print("Please enter a positive integer: ");
            n = scnr.nextInt();
        }

        // Note: 0! = 1; 1! = 1; 2! = 1!*2 = 2; 3! = 2!*3 = 6; etc. 
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);

        scnr.close();
    }
}
