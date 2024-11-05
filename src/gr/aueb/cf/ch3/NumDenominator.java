package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator (Quit with numerator = 0)");
            numerator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero. Quiting....");
                break;
            }

            System.out.println("Please insert denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator must not be zero.");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result " + result);
        }
    }
}








//            if (denominator != 0) {
//                if (numerator != 0) {
//                    result = numerator / denominator;
//                } else {
//                    System.out.println("Numerator is zero");
//                    break;
//                }
//            } else {
//                System.out.println("Denominator is zero");
//                continue;
//            }