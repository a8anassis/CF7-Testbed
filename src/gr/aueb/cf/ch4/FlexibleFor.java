package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Throughout demo of for.
 */
public class FlexibleFor {

    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step;
        Scanner scanner = new Scanner(System.in);
        int iterations = 0;

        System.out.println("Please enter start, end, step");
        startVal = scanner.nextInt();
        endVal = scanner.nextInt();
        step = scanner.nextInt();

        for (int i = startVal; i <= endVal; i += step) {
            iterations++;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Iterations: " + iterations);
    }
}
