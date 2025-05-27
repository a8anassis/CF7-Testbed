package gr.aueb.cf.ch15.math_interfaces;

public class ModWithZeroException extends Exception {
    private final String errorCode;

    public ModWithZeroException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
}
