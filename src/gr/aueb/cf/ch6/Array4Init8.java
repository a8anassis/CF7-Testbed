package gr.aueb.cf.ch6;

/**
 * Δήλωση και αρχικοποίηση ενός πίνακα.
 * Populate ένα πίνακα
 * - new
 * - unsized init
 * - array initializer
 * - print τα στοιχεία ενός πίνακα
 */
public class Array4Init8 {

    public static void main(String[] args) {
        int[] grades = { 10, 9, 3, 4, 1 };
        int[] ages;
        ages = new int[] {18, 22, 30, 24, 25};           // array initializer


        // traverse with legacy for
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + " ");
        }

        // traverse with enhanced for
        for (int age : ages) {
            System.out.print(age + " ");
        }

    }
}
