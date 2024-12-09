package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        try {
            System.out.print("Παρακαλώ εισάγετε δύο ακέραιους.");
            // Data binding
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            result = div(num1, num2);

            System.out.println("Sum: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Η είσοδος πρέπει να είναι ακέραιοι.");
        } catch (Exception e) {
            System.out.println("Λάθος κατά τον υπολογισμό. Δεν μπορεί να γίνει διαίρεση με το μηδέν.");
        }
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

    public static int div(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero");
            return a / b;
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }

    public static int mod(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator must not be zero");
            return a % b;
        } catch (Exception e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }


}
