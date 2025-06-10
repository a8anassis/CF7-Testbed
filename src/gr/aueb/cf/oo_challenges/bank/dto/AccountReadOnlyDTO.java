package gr.aueb.cf.oo_challenges.bank.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class AccountReadOnlyDTO {
    private String IBAN;
    private BigDecimal balance;

    public AccountReadOnlyDTO() {

    }

    public AccountReadOnlyDTO(String IBAN, BigDecimal balance) {
        this.IBAN = IBAN;
        this.balance = balance;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "IBAN='" + IBAN + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AccountReadOnlyDTO account = (AccountReadOnlyDTO) o;
        return Objects.equals(IBAN, account.IBAN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IBAN);
    }
}
