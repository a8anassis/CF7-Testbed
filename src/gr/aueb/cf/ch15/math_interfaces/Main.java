package gr.aueb.cf.ch15.math_interfaces;

public class Main {
    private final static IMath math = new MathImpl();

    public static void main(String[] args) {
        int result = 0;

        try {
            result = math.add(5, 12);
            result = math.div(8, 4);
            result = math.mod(3, 2);
        } catch (DivisionWithZeroException | ModWithZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
