package ie.gmit.scannerpack;

import java.util.Scanner;

/**
 * ScanFlow
 */
public class ScanFlow {
    public static void main(String[] args) {
        birthMonthFinder();
    } // End Main

    static void birthMonthFinder() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the number of the month you were born. (e.g. May = 5)");
        int birthMonth = userInput.nextInt();

        userInput.close();

        if (birthMonth == 1) {
            System.out.println("You were born in January");
        } else if (birthMonth == 2) {
            System.out.println("You were born in February");
        } else if (birthMonth == 3) {
            System.out.println("You were born in March");
        } else if (birthMonth == 4) {
            System.out.println("You were born in April");
        } else if (birthMonth == 5) {
            System.out.println("You were born in May");
        } else if (birthMonth == 6) {
            System.out.println("You were born in June");
        } else if (birthMonth == 7) {
            System.out.println("You were born in July");
        } else if (birthMonth == 8) {
            System.out.println("You were born in August");
        } else if (birthMonth == 9) {
            System.out.println("You were born in September");
        } else if (birthMonth == 10) {
            System.out.println("You were born in October");
        } else if (birthMonth == 11) {
            System.out.println("You were born in November");
        } else if (birthMonth == 12) {
            System.out.println("You were born in December");
        } else {
            System.out.println("Invalid Input: Please enter a number between 1 and 12");
        }
    } // End birthMonthFinder
} // End Class