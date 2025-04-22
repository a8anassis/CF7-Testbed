package gr.aueb.cf.ch5;

public class EvenOddApp8 {

    public static void main(String[] args) {
        int num = 10;
        System.out.println(num + " is even: " + isEven(num));
        System.out.println(num + " is odd: " + isOdd(num));
    }


    /**
     * Even.
     * @param num
     * @return
     */
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    /**
     * Odd.
     *
     * @param num
     * @return
     */
    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}
