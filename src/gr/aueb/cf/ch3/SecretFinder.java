package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπάρχει ένα SECRET που είναι integer και ο χρήστης με
 * μία μόνο προσπάθεια θα προσπαθήσει να τον βρει.
 */
public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert the secret to go on");
        num = scanner.nextInt();

        if (num != SECRET) {
            System.out.println("Secret error");
            System.exit(1);
        }

        System.out.println("Secret was valid. You may go on");
    }
}
