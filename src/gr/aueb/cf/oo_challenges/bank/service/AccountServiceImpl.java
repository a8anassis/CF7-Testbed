//package gr.aueb.cf.oo_challenges.bank.dao;
//
//import gr.aueb.cf.oo_challenges.bank.exceptions.BalanceOvercomeException;
//import gr.aueb.cf.oo_challenges.bank.exceptions.NegativeAmountException;
//import gr.aueb.cf.oo_challenges.bank.model.Account;
//import gr.aueb.cf.oo_challenges.bank.service.IAccountService;
//
//import java.math.BigDecimal;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class AccountServiceImpl implements IAccountService {
//    private final IAccountDAO accountDAO = new AccountDAOImpl();
//
//    @Override
//    public void insertAccount(Account account) {
//        accountDAO.insert(account);
//    }
//
//    @Override
//    public void deposit(Account account, BigDecimal amount) throws NegativeAmountException {
//        try {
//            if (amount.compareTo(BigDecimal.ZERO) < 0) {
//                throw new NegativeAmountException("Invalid amount: " + amount + ". Amount must be positive (input was negative).");
//            }
//            account.setBalance(account.getBalance().add(amount));
//        } catch (NegativeAmountException e) {
//            System.err.printf("%s. The amount=%f is negative. \n%s", LocalDateTime.now(), amount, e);
//            throw e;
//        }
//    }
//
//    @Override
//    public void withdraw(Account account, double amount) throws NegativeAmountException, BalanceOvercomeException {
//        double EPSILON = 0.001;
//
//        try {
//            if (amount < 0) {
//                throw new NegativeAmountException("Invalid amount: " + amount + ". Amount must be positive (input was negative).");
//            }
//
//            if (amount - account.getBalance() > EPSILON) {
//                throw new BalanceOvercomeException("Invalid amount " + amount + ". Amount must be less or equal to balance (input was greater.)");
//            }
//
//            account.setBalance(account.getBalance() - amount);
//        } catch (NegativeAmountException e) {
//            System.err.printf("%s. The amount=%f is negative. \n%s", LocalDateTime.now(), amount, e);
//        } catch (BalanceOvercomeException e) {
//            System.err.printf("%s. The amount=%f is greater than balance. \n%s", LocalDateTime.now(), amount, e);
//        }
//    }
//
//    @Override
//    public double getBalance(String iban) {
//        return 0;
//    }
//
//    @Override
//    public List<Account> getAccounts() {
//        return Collections.unmodifiableList(accounts);
//    }
//}
//
////@Override
////public void deposit(String iban, BigDecimal amount) {
////    var account = getByIban(iban).orElseThrow(); // NoSuchElementException
////    account.setBalance(account.getBalance().add(amount));
////}
////
////@Override
////public void withdraw(String iban, BigDecimal amount) {
////    var account = getByIban(iban).orElseThrow(); // NoSuchElementException
////    account.setBalance(account.getBalance().subtract(amount));
////}
////
////@Override
////public BigDecimal getBalance(String iban) {
////    var account = getByIban(iban);
////    return account.orElseThrow().getBalance();
////}
