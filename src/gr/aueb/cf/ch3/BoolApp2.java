package gr.aueb.cf.ch3;

/**
 * Booleans as conditional expressions.
 */
public class BoolApp2 {

    public static void main(String[] args) {
        boolean isEven;
        boolean isOdd;
        boolean isHot;
        int num = 10;
        int temp = 40;

        // boolean expressions
        isHot = temp >= 40;
        isEven = num % 2 == 0;
        isOdd = num % 2 != 2;
    }
}
