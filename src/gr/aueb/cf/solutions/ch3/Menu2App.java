package gr.aueb.cf.solutions.ch3;

import java.util.Scanner;

public class Menu2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
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

            if (choice != 5) {
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
        } while (choice != 5);
    }
}
