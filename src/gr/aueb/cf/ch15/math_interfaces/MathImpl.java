package gr.aueb.cf.ch15.math_interfaces;

import java.time.LocalDateTime;

public class MathImpl implements IMath {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int div(int a, int b) throws DivisionWithZeroException {
        try {
            if (b == 0) throw new DivisionWithZeroException("DivZeroError", "Η διαίρεση με το 0 απαγορεύεται.");
            return a / b;
        } catch (DivisionWithZeroException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }

    @Override
    public int mod(int a, int b) throws ModWithZeroException {
        try {
            if (b == 0) throw new ModWithZeroException("ModZeroError",  "Η διαίρεση με το 0 απαγορεύεται.");
            return a % b;
        } catch (ModWithZeroException e) {
            System.err.println(LocalDateTime.now() + "\n" + e);
            throw e;
        }
    }
}
