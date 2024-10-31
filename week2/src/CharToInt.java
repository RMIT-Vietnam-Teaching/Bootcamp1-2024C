/*
 * This program reads a character from the user and prints the integer value
 * of the character.
 */

// Importing Scanner class to get input from the user
import java.util.Scanner;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}") 
public class CharToInt {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Declare a variable of type char
        char c;
        // Declare a variable of store the integer value of the char
        int i;

        // Read the character input from the user
        // next() method reads a string token from the user
        // charAt(0) method returns the character at the 0th index of the string
        System.out.print("Enter a word and the first character will be used: ");
        c = scanner.next().charAt(0); 

        // Perform the calculation
        i = c; // Implicit type conversion from char to int

        // Print the output value of i
        System.out.println("The integer value of character " + c + " is " + i);
    }
}
