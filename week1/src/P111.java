/* 
 *  Participation activity P1.1.1 in ZyBooks
 */

// Import Scanner class from java.util package
// Scanner object is needed to read input from the user
import java.util.Scanner;

// Class name must be same with the file name, P111 is the class name in this case
// All Java source code must be inside a class
// Pay attention to indentation, semicolon (";"),
// parenthesis ("(", ")") and braces ("{", "}")
public class P111 {
    // Main method is the starting point of any Java program
    public static void main(String[] args) throws Exception {
        // Create Scanner object to read input
        Scanner s = new Scanner(System.in);

        // Declare three integer variables
        int x, y, z;

        // Read two integers from the user
        // We should print a message to the user to enter the integers
        System.out.println("Hello, this is participant 1.1.1");
        System.out.println("Enter two integers: ");
        x = s.nextInt();
        y = s.nextInt();

        // Calculate the sum of x and y
        z = x + y;

        // Pay attention to print and println
        // Later you will learn printf to format output
        // Print a message to the user with the value of x and y
        System.out.print("The sum of " + x + " and " + y + " is ");
        // Print z and move to the next line
        System.out.println(z);
    }
}
