/*
 * This program calculates the distance between two points.
 */

import java.util.Scanner;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class PointsDistance {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Use scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare Point 1's coordinates
        double x1, y1;
        // Declare Point 2's coordinates
        double x2, y2;
        // Declare a variable distance of type double
        double distance;

        // Prompt user to enter the coordinates for Points 1 and 2
        System.out.println("Please enter coordinates x-y for Points 1 and 2, each on a new line:");
        x1 = scanner.nextDouble(); // Read x1-coordinate from the user
        y1 = scanner.nextDouble(); // Read y1-coordinate from the user
        x2 = scanner.nextDouble(); // Read x2-coordinate from the user
        y2 = scanner.nextDouble(); // Read y2-coordinate from the user

        // Perform the calculation
        distance = Math.sqrt(Math.pow((x1 - x2), 2.0) + Math.pow((y1 - y2), 2.0));

        // Print the output value of distance
        System.out.println("The distance between two points is " + distance);

        scanner.close();
    }
}