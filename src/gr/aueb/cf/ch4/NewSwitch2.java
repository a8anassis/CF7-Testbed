package gr.aueb.cf.ch4;

import java.util.Scanner;

public class NewSwitch2 {

    public static void main(String[] args) {
        int grade;
        char classification;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Εισάγετε ένα βαθμό από 1-10");
        grade = scanner.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> 'F';
            case 5, 6 -> 'G';
            case 7, 8 -> 'V';
            case 9, 10 -> 'E';
            default -> 'U';
        };

        System.out.println(classification);
    }
}
