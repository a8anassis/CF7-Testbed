package gr.aueb.cf.solutions.ch3;

import java.util.Scanner;

/** Ελέγχει αν ένα έτος είναι δίσεκτο.
 * Δίσεκτο είναι ένα έτος αν διαιρείται με το 4
 * και είτε δε διαιρείται με το 100 ή διαιρείται με το 100 και το 400.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        boolean isLeap = false;

        System.out.println("Please insert the year");
        year = in.nextInt();

        /*if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            isLeap = true;
        }*/

        isLeap = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        System.out.println("Year: " + year + " is leap: " + isLeap);
    }
}
