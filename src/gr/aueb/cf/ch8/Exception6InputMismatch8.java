package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Exception6InputMismatch8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.println("Παρακαλώ εισάγετε ένα ακέραιο");

        while (!scanner.hasNextInt()) {
            System.out.println("Μη αποδεκτοί χαρακτήρες. Παρακαλώ εισάγετε ένα ακέραιο");
            scanner.nextLine();
        }
        num1 = scanner.nextInt();

        System.out.println("Num: " + num1);
    }
}
