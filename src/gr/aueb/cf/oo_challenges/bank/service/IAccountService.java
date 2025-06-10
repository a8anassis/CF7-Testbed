package gr.aueb.cf.oo_challenges.bank.service;

import gr.aueb.cf.oo_challenges.bank.dto.AccountInsertDTO;
import gr.aueb.cf.oo_challenges.bank.exceptions.AccountNotFoundException;
import gr.aueb.cf.oo_challenges.bank.exceptions.BalanceOvercomeException;
import gr.aueb.cf.oo_challenges.bank.exceptions.NegativeAmountException;
import gr.aueb.cf.oo_challenges.bank.model.Account;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {
    boolean createNewAccount(AccountInsertDTO dto);
    // add remove account service
    void deposit(String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException;
    void withdraw(String iban, BigDecimal amount) throws NegativeAmountException, BalanceOvercomeException, AccountNotFoundException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<Account> getAccounts();
}
