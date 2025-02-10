package gr.aueb.cf.solutions.ch13.bankapp;

import gr.aueb.cf.ch15.bankapp.exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.bankapp.exceptions.SsnNotValidException;

import java.time.LocalDateTime;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {

    }

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn)
            throws SsnNotValidException, NegativeAmountException {

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }

            setBalance(getBalance() - amount);

            // Logging
            System.out.println("Success in withdraw. Amount:  " + amount + ", SSN: " + ssn);
        } catch (SsnNotValidException | NegativeAmountException e) {
            System.err.println("Error: " + e.getMessage() + ", " + LocalDateTime.now());
            throw e;
        }
    }
}
