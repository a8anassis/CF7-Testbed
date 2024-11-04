package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (ages) to days.
 */
public class YearsToDays {

    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        // Εντολές
        System.out.println("Please insert your age");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        // Εκτύπωση των αποτελεσμάτων
        System.out.println("Age in years: " + age + ", Age in days: " + days);
    }
}
