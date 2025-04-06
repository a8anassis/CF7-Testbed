package gr.aueb.cf.ch2;

import java.util.Map;
import java.util.Scanner;

/**
 * Υπολογίζει το εμβαδό ενός κύκλου με τον
 * τύπο πr^2
 */
public class AreaOfACircle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius;
        double circleArea = 0;

        System.out.println("Παρακαλώ δώστε την ακτίνα του κύκλου");
        radius = scanner.nextInt();
        circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of circle with radius: " + radius + " is: " + circleArea);
        System.out.printf("The area of circle with radius: %d is %.2f", radius, circleArea);
    }
}
