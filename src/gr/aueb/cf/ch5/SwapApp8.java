package gr.aueb.cf.ch5;

/**
 * Οι παράμετροι των μεθόδων λειτουργούν μόνο
 * ως input παράμετροι.
 */
public class SwapApp8 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a=%d, b=%d\n", a, b);
        swap(a, b);
        System.out.printf("a=%d, b=%d", a, b);
    }

    /**
     * Mutually exchanges the values of the two
     * input variables.
     *
     * @param a     the first input.
     * @param b     the second input.
     */
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }


}
