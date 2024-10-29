/* 
 *  Example of a simple Java program that reads a string from the user
 */

// Import Scanner class from java.util package
// Scanner object is needed to read input from the user
import java.util.Scanner;

// Class name must be same with the file name, Greeting is the class name in this case
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class Greeting {
    // Main method is the starting point of any Java program
    public static void main(String[] args) throws Exception {
        // Create Scanner object to read input
        Scanner s = new Scanner(System.in);

        // Declare a String variable
        String studentName = null;

        // Read a string from the user
        // We should print a message to the user to enter the name
        System.out.println("Enter your name: ");
        studentName = s.nextLine();

        // Print a greeting message
        System.out.println("Hello, " + studentName + "!");
    }
}
