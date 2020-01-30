package ie.gmit.scannerpack;

import java.util.Scanner;

/**
 * ScanFlow
 */
public class ScanFlow {
    public static void main(String[] args) {
        birthMontFinder();
    } // End Main

    static void birthMontFinder() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the number of month you where born. (e.g. May = 5)");
        int birthMonth = userInput.nextInt();

        userInput.close();

        if (birthMonth == 1) {
            System.out.println("You were born in January");
        } else if (birthMonth == 2) {
            System.out.println("You were born in February");
        } else if (birthMonth == 3) {
            System.out.println("You were born in March");
        } else {
            System.out.println("Invalid Input: Please enter number between 1 and 12");
        }
    } // End birthMonthFinder
} // End Class