/*
 * This program demonstrates the common error in string comparision.
 * The program compares two strings using the == operator.
 * The == operator compares the references of the strings, not the content.
 * So, the comparison returns false.
 *
 * To fix this error, you can use the equals() method to compare the content of the strings.
 */

public class CommonErrorInStringComparision {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
    }
}
