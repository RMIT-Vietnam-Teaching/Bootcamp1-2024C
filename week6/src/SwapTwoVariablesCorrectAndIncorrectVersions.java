// Swap two variables right and wrong versions
//
// Correct version: Use a temporary variable to swap two variables
// Incorrect version: Swap two variables without using a temporary variable
public class SwapTwoVariablesCorrectAndIncorrectVersions {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // Right version
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Wrong version
        a = 5;
        b = 10;

        a = b;
        b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
