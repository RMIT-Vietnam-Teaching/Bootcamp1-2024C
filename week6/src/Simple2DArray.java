// Create a 2D array of integers and print its elements
public class Simple2DArray {
    public static void main(String[] args) {
        // Create a 2D array of integers
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through the rows of the 2D array
        for (int i = 0; i < matrix.length; i++) {
            // Loop through the columns of the 2D array
            for (int j = 0; j < matrix[i].length; j++) {
                // Print the element at the current row and column
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}
