/*
 * This program converts a total number of seconds to hours, minutes, and seconds.
 */

import java.util.Scanner;

// Class name must be same with the file name.
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class TimeConverter {
    // Main method is the starting point of any Java program
    public static void main(String[] args) {
        // Use scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to hold the total seconds
        int totalSeconds;
        // Declare variables to hold the converted hours, minutes, and seconds
        int hours;
        int minutes;
        int seconds;

        // Prompt the user for input
        System.out.print("Please enter the total number of seconds and press Enter: ");
        // Read the input from the user
        totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and seconds
        hours = totalSeconds / 3600; // 1 hour = 3600 seconds
        int remainingSeconds = totalSeconds % 3600; // Remainder after extracting hours
        minutes = remainingSeconds / 60; // 1 minute = 60 seconds
        seconds = remainingSeconds % 60; // Remainder after extracting minutes

        // Display the output
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds%n",
                totalSeconds, hours, minutes, seconds);

        scanner.close();
    }
}
