package gr.aueb.cf.ch5;

import java.util.Scanner;

public class Calculator8 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Λάθος επιλογή. Η επιλογή πρέπει να είναι μεταξύ 1-6. Προσπαθήστε ξανά.");
                continue;
            }

            if (isChoicesExit(choice)) {
                System.out.println("Έξοδος....");
                break;
            }

            result = provideResultBasedOnChoice(choice);
            printTheResultToStdout(result);
            //System.out.println("Το αποτέλεσμα είναι: " + result);
        }
    }

    public static int provideResultBasedOnChoice(int choice) {
        int num1;
        int num2;

        System.out.println("Παρακαλώ εισάγετε δύο ακεραίους");
        num1 = getOneInt();
        num2 = getOneInt();

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return (b == 0) ? 0 : a / b;
    }

    public static int mod(int a, int b) {
        return (b == 0) ? 0 : a / b;
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
//        if (choice >= 1 && choice <= 6) {
//            return true;
//        } else {
//            return false;
//        }
        return choice >= 1 && choice <= 6;
    }

    public static boolean isChoicesExit(int choice) {
        return choice == 6;
    }

    public static void printTheResultToStdout(int result) {
        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
