package gr.aueb.cf.ch2;

/**
 * Expressions demo.
 */
public class ExpressionsApp2 {

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 10;
        int baseNum = 12;
        int sum = 0;
        int sub = 0;
        int mul = 0;
        int div = 0;
        int mod = 0;
        int result1 = 0;
        int result2 = 0;

        sum = num1 + num2;  // 35
        sub = num1 - num2;  // 15
        mul = num1 * num2;  // 250
        div = num1 / num2;  // 2
        mod = num1 % num2;  // 5

        sum = sum + 1;    // 36
        mul += 1;           // 251

        System.out.printf("Sum: %d, Sub: %d, Mul: %d, Div: %d, Mod: %d\n", sum, sub, mul, div, mod);

        baseNum++;      // 13
                 // 27
        --num2;         // 9

        System.out.printf("baseNum: %d, num1: %d, num2: %d\n", baseNum, num1, num2);

        result1 = num1++;   // result1 = 27, num1 = 28
        result2 = ++num2;   // result2 = 10, num2 = 10

        System.out.printf("result1: %d, result2: %d\n", result1, result2);

        result1 = result1 * 12;
       // result1 *= 12;

        System.out.printf("result1: %d", result1);

    }
}
