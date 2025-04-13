package gr.aueb.cf.ch4;

/**
 *    *
 *   ***
 *  *****
 * *******
 */
public class Pyramid {

    public static void main(String[] args) {

        final int levels = 10;

        for (int i = 1; i <= levels; i++) {

            // initial whitespaces
            for (int j = levels - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // stars
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
