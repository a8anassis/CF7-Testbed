package gr.aueb.cf.oo_challenges.bank.service;

import gr.aueb.cf.oo_challenges.bank.dao.AccountDAOImpl;
import gr.aueb.cf.oo_challenges.bank.dao.IAccountDAO;
import gr.aueb.cf.oo_challenges.bank.dto.AccountInsertDTO;
import gr.aueb.cf.oo_challenges.bank.exceptions.AccountNotFoundException;
import gr.aueb.cf.oo_challenges.bank.exceptions.BalanceOvercomeException;
import gr.aueb.cf.oo_challenges.bank.exceptions.NegativeAmountException;
import gr.aueb.cf.oo_challenges.bank.mapper.Mapper;
import gr.aueb.cf.oo_challenges.bank.model.Account;
import gr.aueb.cf.oo_challenges.bank.validation.Validator;
import org.w3c.dom.ls.LSOutput;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import java.util.AbstractCollection;
import java.util.List;
import java.util.Map;

public class AccountServiceImpl implements IAccountService {

    private final IAccountDAO accountDAO = new AccountDAOImpl();

    @Override
    public void deposit(String iban, BigDecimal amount) throws NegativeAmountException, AccountNotFoundException {
        try {
            Account account = accountDAO.getByIban(iban)
                    .orElseThrow(() -> new AccountNotFoundException("Account with iban= " + iban + " not found"));

            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("Invalid amount: " + amount + ". Amount must be positive (input was negative).");
            }
            account.setBalance(account.getBalance().add(amount));
            accountDAO.saveOrUpdate(account);
        } catch (NegativeAmountException e) {
            System.err.printf("%s. The amount=%f is negative. \n%s", LocalDateTime.now(), amount, e);
            throw e;
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban=%s not found. \n%s", LocalDateTime.now(), iban, e);
            throw e;
        }
    }

    @Override
    public boolean createNewAccount(AccountInsertDTO dto) {
        Map<String , String > errors;
        Account account = Mapper.mapToModelEntity(dto);
        errors = Validator.validate(dto);
        if (!errors.isEmpty()) {
            errors.forEach((k, v) -> System.out.println(v));
            return false;
        }
        accountDAO.saveOrUpdate(account);
        return true;
    }

    @Override
    public void withdraw(String iban, BigDecimal amount) throws NegativeAmountException, BalanceOvercomeException, AccountNotFoundException {
        double EPSILON = 0.001;

        try {
            Account account = accountDAO.getByIban(iban).orElseThrow(() -> new AccountNotFoundException("Account with iban= " + iban + " not found"));

            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                throw new NegativeAmountException("Invalid amount: " + amount + ". Amount must be positive (input was negative).");
            }

            if (amount.compareTo(account.getBalance()) > 0) {
                throw new BalanceOvercomeException("Invalid amount " + amount + ". Amount must be less or equal to balance (input was greater.)");
            }
            account.setBalance(account.getBalance().subtract(amount));
            accountDAO.saveOrUpdate(account);
        } catch (NegativeAmountException e) {
            System.err.printf("%s. The amount=%f is negative. \n%s", LocalDateTime.now(), amount, e);
        } catch (BalanceOvercomeException e) {
            System.err.printf("%s. The amount=%f is greater than balance. \n%s", LocalDateTime.now(), amount, e);
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban=%s not found. \n%s", LocalDateTime.now(), iban, e);
            throw e;
        }
    }

    @Override
    public BigDecimal getBalance(String iban) throws AccountNotFoundException {
        try {
            Account account = accountDAO.getByIban(iban).orElseThrow(() -> new AccountNotFoundException("Account with iban= " + iban + " not found"));
            return account.getBalance();
        } catch (AccountNotFoundException e) {
            System.err.printf("%s. The account with iban=%s not found. \n%s", LocalDateTime.now(), iban, e);
            throw e;
        }
    }

    @Override
    public List<Account> getAccounts() {
        return accountDAO.getAccounts();
    }
}

