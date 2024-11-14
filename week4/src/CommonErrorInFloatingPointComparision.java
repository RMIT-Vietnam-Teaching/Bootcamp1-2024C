/*
 * This program demonstrates the common error in floating point comparison.
 * The program compares the sum of two floating-point numbers with another floating-point number.
 * The sum of two floating-point numbers is 0.30000000000000004, but the expected value is 0.3.
 * So, the comparison returns false.
 *
 * To fix this error, you can use comparision with a small error margin.
 */

public class CommonErrorInFloatingPointComparision {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = 0.3;
        System.out.println(a + b == c); // false
        System.out.println(a + b); // 0.30000000000000004
        System.out.println(c); // 0.3

        // Fix the error
        double errorMargin = 0.0000001;
        System.out.println(Math.abs(a + b - c) < errorMargin); // true
    }
}
