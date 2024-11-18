package gr.aueb.cf.solutions.ch4;

import java.util.Scanner;

/**
 * Gets from the user (standard input), the number of stars,
 * and prints in various formats: 1) Horizontally, 2) Vertically,
 * 3) NxM, 4) Ascending, 5) Descending
 */
public class StarsApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        // Horizontal Stars
        System.out.println("Horizontal Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Vertical Stars
        System.out.println("Vertical Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.println("*");
        }
        System.out.println();

        // Stars nxm
        System.out.println("N x M Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Ascending
        System.out.println("Ascending Stars");
        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Descending
        System.out.println("Descending Stars");
        for (int i = numberOfStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
