//package gr.aueb.cf.oo_challenges.bank.service;
//
//import gr.aueb.cf.oo_challenges.bank.exceptions.BalanceOvercomeException;
//import gr.aueb.cf.oo_challenges.bank.exceptions.NegativeAmountException;
//import gr.aueb.cf.oo_challenges.bank.model.Account;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//public interface IAccountService {
//    void insertOrUpdateAccount(AccountInsertDTO account);
//    void deposit(String iban, BigDecimal amount) throws NegativeAmountException;
//    void withdraw(Account account, BigDecimal amount) throws NegativeAmountException, BalanceOvercomeException;
//    double getBalance(String iban);
//    List<Account> getAccounts();
//}
