/**
 * This example takes an array of integers and returns the index of the largest element.
 */
public class IndexOfMax {

    // Method to find the index of the largest element in an array
    public static int indexOfMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int maxIndex = 0; // Assume the first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i; // Update the index of the largest element
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        // Test arrays
        //int[] numbers = {};
        int[] numbers = {3, 7, 2, 9, 5, 9};

        // Call the indexOfMax method and print the result
        int maxIndex = indexOfMax(numbers);
        System.out.println("Index of the largest element: " + maxIndex);
        System.out.println("Largest element: " + numbers[maxIndex]);
    }
}
