// Copy each element of an array to another array
//
// This is a common operation when working with arrays.
// You might want to create a copy of an array to preserve the original data or to perform operations on the copied array without affecting the original array.
// In this example, we create a copy of an array by iterating over each element of the original array and copying it to the corresponding index in the copied array.
// We then print each element of the original and copied arrays to verify that the copy operation was successful.
public class CopyArrayCorrectVersion {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copiedNumbers = new int[numbers.length];

        // Copy each element of the array to another array
        for (int i = 0; i < numbers.length; i++) {
            copiedNumbers[i] = numbers[i];
        }

        // Print each element of the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Print each element of the copied array
        System.out.println("Copied array:");
        for (int i = 0; i < copiedNumbers.length; i++) {
            System.out.println("copiedNumbers[" + i + "] = " + copiedNumbers[i]);
        }
    }
}
