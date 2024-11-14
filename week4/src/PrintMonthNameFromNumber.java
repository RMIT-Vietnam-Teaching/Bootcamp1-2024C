/*
 * Print the month name based on the month number
 * 1 - January
 * 2 - February
 * 3 - March
 * 4 - April
 * 5 - May
 * 6 - June
 * 7 - July
 * 8 - August
 * 9 - September
 * 10 - October
 * 11 - November
 * 12 - December
 */

import java.util.Scanner;

public class PrintMonthNameFromNumber {
    public static void main(String[] args) {
        int month;

        // Read the month number from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        month = scanner.nextInt();

        // Print the month name based on the month number
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                System.out.println("Invalid month");
        }
        System.out.println("The month is " + monthName);
    }
}
