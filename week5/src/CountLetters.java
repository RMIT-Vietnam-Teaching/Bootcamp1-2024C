import java.util.Scanner;

/* This program counts number of letters in the input word. */
public class CountLetters {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputWord;
        int numLetters;

        System.out.print("Enter a word: ");
        inputWord = scnr.next(); // Get an input word from user

        numLetters = 0; // Start the counter from 0
        for (int i = 0; i < inputWord.length(); ++i) {
            // Increase the counter if the current character is a letter
            if (Character.isLetter(inputWord.charAt(i))) {
                numLetters += 1;
            }
        }

        // Output the result
        System.out.println("Number of letters: " + numLetters);

        scnr.close();
    }
}
