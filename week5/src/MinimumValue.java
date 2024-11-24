import java.util.Scanner;

/**
 * This program finds the minimum value from the list of entered numbers that
 * is ended by the sentinel value of 0.
 */
public class MinimumValue {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double minValue = Double.POSITIVE_INFINITY; // Start with the largest possible value
        double input;

        System.out.println("Enter double values (enter 0 to stop):");

        while (true) {
            input = scnr.nextDouble(); // Read user input

            if (input == 0) {
                break; // Stop the loop if the sentinel value is entered
            }

            // Update the minimum value if a smaller value is found
            if (input < minValue) {
                minValue = input;
            }
        }

        if (minValue == Double.POSITIVE_INFINITY) {
            System.out.println("No values were entered.");
        } else {
            System.out.println("The minimum value entered is: " + minValue);
        }

        scnr.close();
    }
}
