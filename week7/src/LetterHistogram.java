import java.util.Arrays;

/** 
 * This example takes a string as a parameter and returns a histogram of the letters in the string.
 * The zeroth element of the histogram should contain the number of a's in the string
 * (upper- and lowercase); the 25th element should contain the number of z's.
 */
public class LetterHistogram {

    // Method to generate a histogram of letters in a string
    public static int[] letterHist(String str) {
        int[] histogram = new int[26]; // Array to store counts for 'a' to 'z'
        Arrays.fill(histogram, 0);

        // Traverse the string once
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c); // Convert to lowercase for uniformity
                histogram[c - 'a']++; // Increment the appropriate counter
            }
        }

        return histogram;
    }

    public static void main(String[] args) {
        // Test the letterHist method
        String input = "Hello World! I am Minh.";
        int[] histogram = letterHist(input);

        // Print the histogram
        for (int i = 0; i < histogram.length; i++) {
            char letter = (char) ('a' + i);
            System.out.println(letter + ": " + histogram[i]);
        }
    }
}
