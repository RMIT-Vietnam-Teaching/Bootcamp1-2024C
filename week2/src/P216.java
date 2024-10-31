/* 
 * This is a similar program to Participation Activity 2.1.6
 */

 // Importing Scanner class to get input from the user
import java.util.Scanner;

// Class name must be same with the file name, P216 is the class name in this case
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class P216 {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable x of type double
        double x;

        // Print a message to the user
        // and read the floating-point input number from the user
        System.out.print("Enter a floating-point number: ");
        x = scanner.nextDouble();   // nextDouble() reads a double value from the user

        // Perform the calculation
        x = x * 20; // Implicit type conversion from int to double
        x += 0.5;

        // Print the output value of x
        System.out.println("The output value of x is " + x);
    }
}
