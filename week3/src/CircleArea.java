/*
 * This program calculates the area of a circle.
 */

import java.util.Scanner;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class CircleArea {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Use scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable radius of type double
        double radius;
        // Declare a variable area of type double
        double area;

        // Prompt user to enter the radius of the circle
        System.out.println("Please enter the radius of the circle and press Enter:");
        radius = scanner.nextDouble(); // Read the radius from the user input

        // Perform the calculation, using constant PI from the Math package
        area = Math.PI * Math.pow(radius, 2.0);

        // Print the output value of the area
        System.out.println("The area of the circle is " + area);

        scanner.close();
    }
}
