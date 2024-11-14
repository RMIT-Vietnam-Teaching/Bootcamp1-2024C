/*
 * This program demonstrates the common error in omitting braces with if-else statements.
 * The program prints "x is greater than 5" if x is greater than 5.
 * The program prints "This line is always printed" always because the if statement doesn't have braces.
 * So, the if statement only applies to the next statement.
 */

public class CommonErrorInOmittingBracesWithIfElse {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5)
            System.out.println("x is greater than 5");
            System.out.println("This line is always printed");
    }
}
