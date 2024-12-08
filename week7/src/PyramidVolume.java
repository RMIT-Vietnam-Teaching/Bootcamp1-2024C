import java.util.Scanner;

/**
 * This example calculates the volume of a pyramid based on its length, width, and height.
 */
public class PyramidVolume {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double userLength;
        double userWidth;
        double userHeight;

        // Get the pyramid's length, width, and height from input
        userLength = scnr.nextDouble();
        userWidth = scnr.nextDouble();
        userHeight = scnr.nextDouble();

        // Invoke method to calculate the pyramid volume and print out the result
        System.out.println("Volume: " + pyramidVolume(userLength, userWidth, userHeight));

        scnr.close();
    }

    /** 
     * Method to calculate the pyramid volume
     *    Volume = base area x height x 1/3
     *    Base area = base length x base width
     */
    public static double pyramidVolume(double length, double width, double height) {
        double area = length * width;
        double volume = area * height * (1.0 / 3.0);
        return volume;
    }
}