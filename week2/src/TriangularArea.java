/*
 * This program calculates the area of a triangle.
 */

import java.util.Scanner;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class TriangularArea {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Use scanner to get an input string from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable base of type double
        double base;
        // Declare a variable height of type double
        double height;
        // Declare a variable area of type double
        double area;

        // Print a message to the user
        System.out.println("This program calculates the area of a triangle.");
        System.out.println("Please enter the base and height of the triangle.");
        base = scanner.nextDouble(); // Read the base of the triangle from the user
        height = scanner.nextDouble(); // Read the height of the triangle from the user

        // Perform the calculation
        area = 0.5 * base * height;

        // Print the output value of area
        System.out.println("The area of the triangle is " + area);
    }

}
