// Modify each element of an array by multiplying it by 2
//
// This is a common operation when working with arrays.
// You might want to modify each element of an array by performing some operation on it.
// In this example, we modify each element of an array of integers by multiplying it by 2.
public class ModifyArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Print each element of the array before modification
        System.out.println("Before modification:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Modify each element of the array by multiplying it by 2
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        // Print each element of the array after modification
        System.out.println("After modification:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
