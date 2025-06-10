package gr.aueb.cf.oo_challenges.bank.validation;

import gr.aueb.cf.oo_challenges.bank.dto.AccountInsertDTO;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Validator {

    private Validator() {

    }

    public static Map<String, String > validate(AccountInsertDTO dto) {
        Map<String, String> errors = new HashMap<>();

        if (dto.getIBAN() == null || dto.getIBAN().trim().length() < 5) {
            errors.put("iban", "Το iban πρέπει να είναι μεγαλύτερο από 5 ψηφία.");
        }

        if (dto.getBalance().compareTo(BigDecimal.ZERO) < 0) {
            errors.put("balance", "Το υπόλοιπο πρέπει να είναι θετικό ή μηδέν.");
        }

        return errors;
    }
}
