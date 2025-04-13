package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NewSwitch {

    public static void main(String[] args) {
        int grade;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε ένα βαθμό από 1-10");
        grade = scanner.nextInt();

        switch (grade) {
            case 1, 2, 3, 4 -> System.out.println("Κάτω από τη βάση");
            case 5, 6 -> System.out.println("καλώς");
            case 7, 8 -> System.out.println("Λίαν καλώς");
            case 9, 10 -> System.out.println("Άριστα");
            default -> System.out.println("Λάθος εισαγωγή");
        }
    }
}
