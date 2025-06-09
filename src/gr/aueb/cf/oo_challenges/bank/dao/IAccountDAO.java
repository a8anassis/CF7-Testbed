package gr.aueb.cf.oo_challenges.bank.dao;

import gr.aueb.cf.oo_challenges.bank.exceptions.AccountNotFoundException;
import gr.aueb.cf.oo_challenges.bank.model.Account;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface IAccountDAO {
    void saveOrUpdate(Account account);
    void remove(String iban);
    Optional<Account> getByIban(String iban);
    List<Account> getAccounts();
}
