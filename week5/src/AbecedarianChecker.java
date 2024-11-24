import java.util.Scanner;

/**
 * This program checks if a given word is abecedarian, meaning its letters
 * appear in alphabetical order. The user enters a word, and the program
 * outputs whether it is abecedarian.
 */
public class AbecedarianChecker {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.println("Enter a word:");
        String word = scnr.nextLine().toLowerCase(); // Convert to lowercase

        // Initialize the flag to true
        boolean isAbecedarian = true;

        // Check if the word's letters are in alphabetical order
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                isAbecedarian = false;
                break;
            }
        }

        // Output the result
        if (isAbecedarian) {
            System.out.println("The word \"" + word + "\" is abecedarian.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT abecedarian.");
        }

        scnr.close();
    }
}
