package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert miles to km.
 */
public class MilesToKm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double KM_PER_MILE = 1.6;
        double inputMiles = 0.0;
        double kilometers = 0.0;

        System.out.println("Please insert miles");
        inputMiles = sc.nextDouble();
        kilometers = inputMiles * KM_PER_MILE;

        System.out.println("Miles: " + inputMiles + ", Km: " + kilometers);
    }
}
