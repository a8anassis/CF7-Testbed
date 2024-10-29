package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at console
 * (standard output).
 */
public class AddApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση Μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Εντολές
        result = num1 + num2;

        // Εκτύπωση του αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των " + num1 + ", " + num2 + " είναι ίσο με: " + result);
        System.out.printf("Το άθροισμα των %d, %d είναι ίσο με: %d\n", num1, num2, result);
    }
}
