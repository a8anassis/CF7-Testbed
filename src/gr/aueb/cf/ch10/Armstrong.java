package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int numberOfDigits;
        int originalNum;
        int digit;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();
        numberOfDigits = String.valueOf(num).length();  // valueOf transforms a primitive to String
        originalNum = num;

        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;          // num = num / 10;
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum) ? " is" : " is not" );
    }
}
