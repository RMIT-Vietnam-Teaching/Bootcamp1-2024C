import java.util.Scanner;

/* This example counts number of letters in the input word. */
public class LetterCounter {

    // Method to count the number of letters in a word
    public static int countLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        // Count letters in the input
        int letterCount = countLetters(word);

        // Display the result
        System.out.println("The word \"" + word + "\" has " + letterCount + " letters.");

        scanner.close();
    }
}
