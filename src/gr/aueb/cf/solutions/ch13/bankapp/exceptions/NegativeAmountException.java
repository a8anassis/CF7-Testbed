package gr.aueb.cf.solutions.ch13.bankapp.exceptions;

public class NegativeAmountException extends Exception {
    private static final long serialVersionUID = 14567L;

    public NegativeAmountException() {
        super("Amount negative");
    }

    public NegativeAmountException(double amount) {
        super("Amount: " + amount  + " is negative");
    }
}
