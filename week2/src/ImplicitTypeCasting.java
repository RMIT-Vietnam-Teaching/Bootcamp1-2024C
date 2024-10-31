/*
 * Implicit Type Casting
 */

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class ImplicitTypeCasting {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Declare a variable x of type double
        double x = 10.5;

        // Perform the calculation
        x = x * 20; // Implicit type conversion from int to double
        x += 0.5;

        // Print the output value of x
        System.out.println("The output value of x is " + x);
    }
}
