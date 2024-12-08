/**
 * This example checks if a given word is abecedarian, meaning its letters
 * appear in alphabetical order. The user enters a word, and the program
 * outputs whether it is abecedarian.
 */
public class AbecedarianCheck {

    // Method to check if a given word is abecedarian
    public static boolean isAbecedarian(String word) {
        // Convert the word to lowercase to handle case-insensitivity
        word = word.toLowerCase();

        // Check if each character is in alphabetical order
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                return false; // Not in alphabetical order
            }
        }
        return true; // The word is abecedarian
    }

    public static void main(String[] args) {
        // Test cases using assert
        assert isAbecedarian("abdest") : "Test failed for 'abdest'";
        assert isAbecedarian("acknow") : "Test failed for 'acknow'";
        assert !isAbecedarian("zebra") : "Test failed for 'zebra'";
        assert isAbecedarian("bijoux") : "Test failed for 'bijoux'";
        assert isAbecedarian("biopsy") : "Test failed for 'biopsy'";
        assert !isAbecedarian("cba") : "Test failed for 'cba'";

        // If the program reaches this point, it passed all the test cases
        System.out.println("All test cases passed!");
    }
}
