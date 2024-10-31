/*
 * This program demonstrates explicit type casting in Java.
 */

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class ExplicitTypeCasting {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Declare a variable x of type double
        double x = 10.5;
        int y;

        // Perform the calculation
        y = (int)x; // Explicit type conversion from double to int
        y = y / 3;  // 10/3 = 3 because they are both integers

        // Print the output value of y
        System.out.println("The output value of y is " + y);
    }
}
