/*
 * Detect the shape of a triangle based on its sides
 * Equilateral triangle: all sides are equal
 * Isosceles triangle: two sides are equal
 * Scalene triangle: all sides are different
 */

import java.util.Scanner;

public class DetectTriangleShape {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        // Read the sides of the triangle from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        a = scanner.nextDouble();
        System.out.print("Enter the second side: ");
        b = scanner.nextDouble();
        System.out.print("Enter the third side: ");
        c = scanner.nextDouble();

        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
