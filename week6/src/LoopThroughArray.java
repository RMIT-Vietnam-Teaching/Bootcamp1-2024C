// Loop through an array and print each element
//
// This is a common operation when working with arrays.
// You might want to iterate over each element of an array to perform some operation on each element or to print each element to the console.
// In this example, we loop through an array of integers and print each element to the console.
public class LoopThroughArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
