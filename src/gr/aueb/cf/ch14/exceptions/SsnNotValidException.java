package gr.aueb.cf.ch14.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUID = -123456789L;

    public SsnNotValidException(String ssn) {
        super("Ssn: " + ssn + " not valid");
    }
}

