package gr.aueb.cf.solutions.ch5;

import java.util.Scanner;

/**
 * Demonstrates stars-app with methods.
 */
public class StarsApp {

    public static void main(String[] args) {
        int choice = 0;
        int numberOfStars = 0;
        Scanner in = new Scanner(System.in);

        do {
            printMenu();
            choice = in.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Λάθος επιλογή");
                continue;
            }

            if (choice != 6 ) {
                System.out.println("Δώστε αριθμό stars");
                numberOfStars = in.nextInt();
            }

            switch (choice) {
                case 1:
                    printStarsH(numberOfStars);
                    break;
                case 2:
                    printStarsV(numberOfStars);
                    break;
                case 3:
                    printStarsHV(numberOfStars);
                    break;
                case 4:
                    printStarsAsc(numberOfStars);
                    break;
                case 5:
                    printStarsDesc(numberOfStars);
                    break;
                case 6:
                    System.out.println("Quiting...");
                    break;
                default:
                    System.out.println("Error in choice ");
                    break;
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Οριζόντια Αστεράκια");
        System.out.println("2. Κάθετα Αστεράκια");
        System.out.println("3. nxm Αστεράκια");
        System.out.println("4. Ascending Αστεράκια");
        System.out.println("5. Descending Αστεράκια");
        System.out.println("6. Έξοδος");
    }

    /**
     * Prints n stars horizontally.
     *
     * @param n     the number of stars
     */
    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * Prints n stars vertically.
     *
     * @param n     the number of stars
     */
    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
        }
        System.out.println();
    }
}
