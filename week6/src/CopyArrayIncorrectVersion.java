// This program demonstrates that copying an array by reference is incorrect.
// The copied array is actually a reference to the original array,
// so modifying the original array also modifies the copied array.
public class CopyArrayIncorrectVersion {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] copiedNumbers = numbers;

        // Print each element of the copied array before the modification
        System.out.println("Copied array before modifying the original:");
        for (int i = 0; i < copiedNumbers.length; i++) {
            System.out.println("copiedNumbers[" + i + "] = " + copiedNumbers[i]);
        }

        // Modify each element of the original array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        // Print each element of the original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Print each element of the copied array
        System.out.println("Copied array after modifying the original:");
        for (int i = 0; i < copiedNumbers.length; i++) {
            System.out.println("copiedNumbers[" + i + "] = " + copiedNumbers[i]);
        }
    }
}
