package gr.aueb.cf.ch5;

/**
 * Demo of method overloading.
 */
public class MethodOverloading8 {

    public static void main(String[] args) {
        int sum1, sum2;
        long sum3;
        int sum4;

        sum1 = add(1, 3);
        sum2 = add(1, 4L);
        sum3 = add(1L, 5L);
        sum4 = add(1, 3, 5);

        System.out.printf("%d \t%d \t%d \t%d\n", sum1, sum2, sum3, sum4);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, long b) {
        return a + (int) b;
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }


}
