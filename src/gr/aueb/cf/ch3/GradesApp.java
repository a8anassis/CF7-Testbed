package gr.aueb.cf.ch3;

import java.awt.*;
import java.util.Scanner;

/**
 * Ο χρήστης θα δίνει:
 * 1. τους συνολικούς βαθμούς μαθημάτων
 * 2. το πλήθος των μαθημάτων
 *
 * Θα υπολογίζει τον μέσο όρο και θα χαρακτηρίζει
 * 'Άριστα' αν ο μ.όρος είναι >= 9, 'Πολύ καλά' αν
 * ο μέσος όρος είναι >= 7 και "Καλώς" αν 0 μέσος
 * όρος είναι >= 5 και 'Αποτυχία' αν ο μ.όρος είναι
 * < 5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero.");
            System.exit(1);
        }

        System.out.println("Please insert courses count.");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be negative or zero.");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal than 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {    // average < 5
            System.out.println("Failure");
        }
    }
}
