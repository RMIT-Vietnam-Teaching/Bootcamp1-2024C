/**
 * This example takes an integer n and an array of integers, and returns true if the numbers
 * in the array are all factors of n (which is to say that n is divisible by all of them).
 */
public class FactorsCheck {

    // Method to check if all elements in the array are factors of n
    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            // If n is not divisible by any factor, return false
            if (n % factor != 0) {
                return false;
            }
        }
        return true; // All elements are factors of n
    }

    public static void main(String[] args) {
        int n = 12;
        int[] factors1 = { 1, 2, 3, 4 };    // All are factors of 12
        int[] factors2 = { 1, 2, 5 };       // 5 is not a factor of 12

        System.out.println("Are all factors1 factors of " + n + "? " + areFactors(n, factors1)); // true
        System.out.println("Are all factors2 factors of " + n + "? " + areFactors(n, factors2)); // false
    }
}
