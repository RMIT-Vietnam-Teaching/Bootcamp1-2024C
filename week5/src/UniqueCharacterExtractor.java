import java.util.Scanner;

/**
 * This program extracts unique characters from the user-entered string, skipping whitespaces. The
 * output will be the list of unique charaters, each separated by a comma and a space.
 */
public class UniqueCharacterExtractor {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scnr.nextLine();

        String uniqueChars = ""; // To store unique characters

        // Loop through each character in the input
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Skip whitespace characters
            if (Character.isWhitespace(currentChar)) {
                continue;
            }

            // Check if the character is not already in uniqueChars
            if (uniqueChars.indexOf(currentChar) == -1) {
                // Add a comma and space if uniqueChars is not empty
                if (!uniqueChars.isEmpty()) {
                    uniqueChars += ", ";
                }
                // Add the unique character to the output
                uniqueChars += currentChar;
            }
        }

        // Print the result
        System.out.println("Unique characters: " + uniqueChars);

        scnr.close();
    }
}