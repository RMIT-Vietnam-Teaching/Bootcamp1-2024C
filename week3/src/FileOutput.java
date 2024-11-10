/*
 * This program writes formatted content to a file.
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class FileOutput {
    // Main method is the starting point of any Java program
    public static void main(String[] args) throws IOException {
        // Create a Scanner object for user input
        Scanner scnr = new Scanner(System.in);

        // Declare file output stream and PrintWriter for writing to the file
        FileOutputStream fileStream = null;
        PrintWriter eggFS = null;

        // Declare variables to store user input: quantity of eggs and guest name
        double eggQuantity;
        String guestName;

        // Prompt and read egg quantity from user
        System.out.print("Enter quantity of eggs (in pounds): ");
        eggQuantity = scnr.nextDouble();

        // Prompt and read guest name from user
        System.out.print("Enter guest name: ");
        guestName = scnr.next();

        // Open the file "egg.txt" in the "resources" directory for writing
        fileStream = new FileOutputStream("resources/egg.txt");
        eggFS = new PrintWriter(fileStream);

        // Write formatted content to the file
        eggFS.println("To purchase:");
        eggFS.println("= = =");
        eggFS.println(eggQuantity + " pounds of eggs for " + guestName);
        eggFS.println("= = =");

        // Close the PrintWriter to ensure all data is written to the file
        eggFS.close();
        System.out.println("Order written to file successfully.");
    }
}
