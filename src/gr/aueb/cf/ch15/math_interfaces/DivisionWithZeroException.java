package gr.aueb.cf.ch15.math_interfaces;

public class DivisionWithZeroException extends Exception {
    private final String errorCode;

    public DivisionWithZeroException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
