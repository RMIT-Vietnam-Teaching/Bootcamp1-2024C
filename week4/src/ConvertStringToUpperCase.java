/*
 * Convert a string to uppercase using two methods:
 * 1. Using the toUpperCase() method of the String class.
 * 2. Using the toUpperCase() method of the Character class to convert each character to uppercase.
 */

import java.util.Scanner;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        String str = "hello, world!";
        System.out.print("Uppercase using method 1 (string): ");
        String upperCaseStr = str.toUpperCase();
        System.out.println(upperCaseStr); // HELLO, WORLD!

        // Covert each character to uppercase
        System.out.print("Uppercase using method 2 (character): ");
        // For-loop will be explained in more detail in the next lesson
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char upperCaseCh = Character.toUpperCase(ch);
            System.out.print(upperCaseCh);
        }
        System.out.println();

        // Read a string from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String upperCaseInput = input.toUpperCase();
        System.out.print("Uppercase using method 1 (string): ");
        System.out.println(upperCaseInput);

        // Covert each character to uppercase
        System.out.print("Uppercase using method 2 (character): ");
        // For-loop will be explained in more detail in the next lesson
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            char upperCaseCh = Character.toUpperCase(ch);
            System.out.print(upperCaseCh);
        }
    }
}
