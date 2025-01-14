package gr.aueb.cf.ch13.exceptions;

public class SsnNotValidException extends Exception {

    public SsnNotValidException(String ssn) {
        super("SSN " + ssn + " is not valid.");
    }
}
