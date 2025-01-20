package gr.aueb.cf.ch16.function;

public class Main {

    public static void main(String[] args) {
        ICalculator addition = new AdditionCalculator();
        int result = addition.operate(1, 2);
        System.out.println(result);

        ICalculator sub = new ICalculator() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        };

        int result2 = sub.operate(10, 6);
        System.out.println(result2);

        ICalculator mul = (a, b) -> a * b;
        int result3 = mul.operate(3, 7);
        System.out.println(result3);
    }
}
