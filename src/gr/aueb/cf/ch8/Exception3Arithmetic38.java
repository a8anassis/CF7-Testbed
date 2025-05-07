package gr.aueb.cf.ch8;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Exception3Arithmetic38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int result = 0;



        while (true) {
            System.out.println("Please insert two integers");
            num1 = scanner.nextInt();
            if (num1 == 0) break;

            num2 = scanner.nextInt();

            try {
                if (num2 == 0) {
                    System.out.println("Ο παρονομαστής δεν μπορεί να είναι 0");
                    continue;
                }
                result = num1 / num2;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.err.println(LocalDateTime.now() + "\n" + e);
            }
        }
        System.out.println("Thanks for using the app");
    }
}
