package gr.aueb.cf.solutions.ch14.validation_utils;

public class ValidationUtil {

    private ValidationUtil() {

    }

    public boolean isStringLengthValid(String input) {
        return input != null && !input.isEmpty() && input.length() <= 31;
    }

    public boolean isIntBetween1And10(int number) {
        return number >= 1 && number <= 10;
    }
}
