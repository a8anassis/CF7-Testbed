package gr.aueb.cf.solutions.ch13.bankapp;

import gr.aueb.cf.ch15.bankapp.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch15.bankapp.exceptions.NegativeAmountException;
import gr.aueb.cf.ch15.bankapp.exceptions.SsnNotValidException;

import java.time.LocalDateTime;

public class Account extends IdentifiableEntity {
    private String iban;
    private User holder;
    private double balance;

    public Account() {

    }

    public Account(String iban, User holder, double balance) {
        this.iban = iban;
        //this.holder = holder;
        this.holder = new User(holder);
        this.balance = balance;
    }

    public String getIban() {
        return iban;
    }
    public void setIban(String iban) {
        this.iban = iban;
    }

    public User getHolder() {
        return new User(holder);
    }
    public void setHolder(User holder) {
        this.holder = new User(holder);
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uuid=" + getUuid() +
                "iban='" + iban + '\'' +
                ", holder=" + holder +
                ", balance=" + balance +
                '}';
    }

    /**
     * Deposits a certain amount of money into user's
     * {@link Account}, thus increasing the {@link Account#balance}.
     *
     * @param amount
     *          the amount of money to be deposited.
     * @throws NegativeAmountException
     *          if the amount to be deposited is negative.
     */
    public void deposit(double amount) throws NegativeAmountException {
        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            balance += amount;

            // Logging
            System.out.println("Balance deposit: " + holder + ", amount: " + amount + ", " + LocalDateTime.now());
        } catch (NegativeAmountException e) {
            // Logging
            System.err.println("Error in deposit service: Negative amount exception, " + LocalDateTime.now());
            throw e;
        }
    }

    /**
     * Withdraws an amount of money from an {@link Account}.
     *
     * @param amount
     *          the amount of money to withdraw.
     * @param ssn
     *          the ssn of {@link Account#holder}.
     * @throws InsufficientBalanceException
     *          if the amount to withdraw is greater than the balance.
     * @throws SsnNotValidException
     *          if the given ssn is not valid.
     * @throws NegativeAmountException
     *          if the amount to withdraw is negative.
     */
    public void withdraw(double amount, String ssn)
            throws InsufficientBalanceException, SsnNotValidException, NegativeAmountException {

        try {
            if (amount < 0) {
                throw new NegativeAmountException(amount);
            }
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            if (amount > balance) {
                throw new InsufficientBalanceException(balance, amount);
            }
            balance -= amount;

            // Logging
            System.out.println("Balance withdraw success. Ssn: " + ssn + ", amount: "
                    + amount + ", " + LocalDateTime.now());
        } catch (InsufficientBalanceException | SsnNotValidException | NegativeAmountException e) {
            System.err.println("Service error: " + e.getMessage() + ", " + LocalDateTime.now());
            throw e;
        }
    }

    /**
     * Returns the {@link Account#balance}.
     *
     * @return the balance.
     */
    public double getAccountBalance() {
        return balance;
    }

    protected boolean isSsnValid(String ssn) {
        if (ssn == null || this.getHolder().getSsn() == null) {
            return false;
        }
        return this.holder.getSsn().equals(ssn);
    }

}
