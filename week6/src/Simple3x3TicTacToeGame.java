// Create a simple 3x3 Tic-Tac-Toe game
// The game board is represented by a 3x3 2D array
// The players are represented by 'X' and 'O'
// The empty cells are represented by ' '
// The game board is printed to the console
// The players make moves on the board
// The updated board is printed to the console
// The purpose of this program is to demonstrate the use of a 2D array to represent a game board
public class Simple3x3TicTacToeGame {
    public static void main(String[] args) {
        // Create a 3x3 Tic-Tac-Toe board
        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        // Print the initial state of the board
        System.out.println("Initial state of the board:");
        printBoard(board);

        // Make some moves on the board
        board[0][0] = 'X';
        board[1][1] = 'O';
        board[2][2] = 'X';

        // Print the updated state of the board
        System.out.println("Updated state of the board:");
        printBoard(board);
    }

    // Helper method to print the Tic-Tac-Toe board
    // More information will be given in the incoming lessons
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("---------");
            }
        }
    }
}
