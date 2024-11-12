package gr.aueb.cf.solutions.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα μενού με επιλογές από 1-5
 * μέχρι ο χρήστης να δώσει τον αριθμό 5 (Έξοδος).
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            System.out.print("Δώστε επιλογή: ");

            choice = in.nextInt();

            if (choice <= 0 || choice >= 6) {
                System.out.println("Λάθος Επιλογή");
                continue;
            }

            if (choice == 5) {
                System.out.println("Έξοδος..");
                break;
            }

            if (choice == 1) {
                System.out.println("Εισαγωγή");
            } else if (choice == 2) {
                System.out.println("Διαγραφή");
            } else if (choice == 3) {
                System.out.println("Ενημέρωση");
            } else {  // choice == 4
                System.out.println("Αναζήτηση");
            }
        }
    }
}
