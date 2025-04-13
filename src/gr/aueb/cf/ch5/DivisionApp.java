package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Διαίρεση και υπόλοιπο δεκαδικών.
 */
public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double result = 0d;
        double remaining = 0.0;

        System.out.println("Please enter two doubles");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();
        result = num1 / num2;
        remaining = num1 % num2;

        System.out.printf("Div: %5.2f\n", result);
        System.out.printf("Mod: %5.2f", remaining);
    }
}
