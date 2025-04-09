package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα ακέραιο. Το πρόγραμμα απομονώνει
 * το κάθε ψηφίο ξεκινώντας από δεξιά με mod. Αυξάνει
 * κατά ένα το count και το προσθέτει και στο sum.
 * Διαιρεί δια 10 διαδοχικά μέχρι να γίνει 0 το πηλίκο.
 *
 */
public class DigitCountAndSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum;
        int digitsCount = 0;
        int digitsSum = 0;
        int num;
        int digit;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο αριθμό. ");
        inputNum = scanner.nextInt();
        num = inputNum;

        while (true) {
            digit = num % 10;
            digitsCount++;
            digitsSum += digit;
            num /= 10;
            if (num == 0) break;
        }

        System.out.println("Digits count: " + digitsCount);
        System.out.println("Digits sum: " + digitsSum);
    }
}
