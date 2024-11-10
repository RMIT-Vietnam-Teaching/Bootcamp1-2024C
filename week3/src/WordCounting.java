/*
 * This program counts the occurrences of a specific word in a file.
 */

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class WordCounting {
    // Main method is the starting point of any Java program
    public static void main(String[] args) throws IOException {
        // Create a Scanner object for user input
        Scanner scnr = new Scanner(System.in);

        // Declare file input stream for reading the file
        FileInputStream fileByteStream = null;

        // Create a Scanner object to read the content of the file
        Scanner inFS = null;

        // Declare variables to store the user-provided word and frequency count
        String userWord;
        int wordFreq = 0;

        // Declare variable to hold each word read from the file
        String currWord;

        // Attempt to open the file
        System.out.println("Opening file wordFile.txt in folder resources");
        fileByteStream = new FileInputStream("resources/wordFile.txt"); // Open the file
        inFS = new Scanner(fileByteStream); // Initialize scanner for reading file content

        // Prompt the user to enter the word to search for in the file
        System.out.print("Enter a word: ");
        userWord = scnr.next(); // Read the word from the user

        // Loop through each word in the file
        while (inFS.hasNext()) { // Check if there are more words in the file
            currWord = inFS.next(); // Read the next word from the file

            // Check if the current word matches the user-provided word
            if (currWord.equals(userWord)) {
                ++wordFreq; // Increment frequency count if words match
            }
        }

        // Output the result to the user
        System.out.println(userWord + " appears in the file " +
                wordFreq + " times.");

        // Close the file to free up resources
        fileByteStream.close(); // close() may throw IOException if it fails
        inFS.close(); // Close the file scanner
    }
}
