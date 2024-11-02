/*
 * Reverse a string in Java
 */

// Import the Scanner class to read input from the user
import java.util.Scanner;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class StringReverse {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Use scanner to get an input string from the user
        // Reverse the string and print it
        
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable of type String
        String str;
        // Declare a variable of type String to store the reversed string
        String reversedStr = "";

        // Read the string input from the user
        // nextLine() method reads a string from the user
        System.out.print("Enter a string: ");
        str = scanner.nextLine();

        // Perform the calculation to reverse the string
        // Loop through the string from the end to the beginning
        // Append each character to the reversedStr variable
        // More about for loop: https://www.w3schools.com/java/java_for_loop.asp
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        // Print the output value of reversedStr
        System.out.println("The reversed string is " + reversedStr);
    }
}
