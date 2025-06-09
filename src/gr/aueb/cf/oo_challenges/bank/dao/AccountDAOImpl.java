package gr.aueb.cf.oo_challenges.bank.dao;

import gr.aueb.cf.oo_challenges.bank.exceptions.AccountNotFoundException;
import gr.aueb.cf.oo_challenges.bank.model.Account;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class AccountDAOImpl implements IAccountDAO {

    private final List<Account> accounts = new ArrayList<>();

    @Override
    public void saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);
        if (index != -1) {
            accounts.set(index, account);
            return;
        }
        accounts.add(account);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(a -> a.getIBAN().equals(iban));
    }

    @Override
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public Optional<Account> getByIban(String iban) {
        return accounts.stream()
                .filter(a -> a.getIBAN().equals(iban))
                .findFirst();
    }
}
