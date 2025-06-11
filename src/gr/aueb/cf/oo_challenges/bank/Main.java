package gr.aueb.cf.oo_challenges.bank;

import gr.aueb.cf.oo_challenges.bank.dto.AccountInsertDTO;
import gr.aueb.cf.oo_challenges.bank.dto.AccountReadOnlyDTO;
import gr.aueb.cf.oo_challenges.bank.exceptions.AccountNotFoundException;
import gr.aueb.cf.oo_challenges.bank.exceptions.BalanceOvercomeException;
import gr.aueb.cf.oo_challenges.bank.exceptions.NegativeAmountException;
import gr.aueb.cf.oo_challenges.bank.model.Account;
import gr.aueb.cf.oo_challenges.bank.service.AccountServiceImpl;
import gr.aueb.cf.oo_challenges.bank.service.IAccountService;
import gr.aueb.cf.oo_challenges.bank.validation.Validator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        IAccountService accountService = new AccountServiceImpl(); // your service implementation
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Account Service Menu ===");
            System.out.println("1. Insert New Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String option = scanner.nextLine();

            try {
                switch (option) {
                    case "1":
                        System.out.print("Enter IBAN: ");
                        String newIban = scanner.nextLine();
                        System.out.print("Enter initial balance: ");
                        BigDecimal initialBalance = new BigDecimal(scanner.nextLine());
                        AccountInsertDTO accountInsertDTO = new AccountInsertDTO(newIban, initialBalance);

                        Map<String , String > errors;
                        errors = Validator.validate(accountInsertDTO);
                        if (!errors.isEmpty()) {
                            errors.forEach((k, v) -> System.out.println(v));
                            System.out.println("Ο λογαριασμός δεν δημιουργήθηκε. Προσπαθήστε ξανά.");
                            break;
                        }

                        // Assumes you have a method like saveOrUpdate in your service

                        accountService.createNewAccount(accountInsertDTO);
                        System.out.println("Account inserted successfully.");
                        break;

                    case "2":
                        System.out.print("Enter IBAN: ");
                        String depositIban = scanner.nextLine();
                        System.out.print("Enter amount to deposit: ");
                        BigDecimal depositAmount = new BigDecimal(scanner.nextLine());
                        accountService.deposit(depositIban, depositAmount);
                        System.out.println("Deposit successful.");
                        break;

                    case "3":
                        System.out.print("Enter IBAN: ");
                        String withdrawIban = scanner.nextLine();
                        System.out.print("Enter amount to withdraw: ");
                        BigDecimal withdrawAmount = new BigDecimal(scanner.nextLine());
                        accountService.withdraw(withdrawIban, withdrawAmount);
                        System.out.println("Withdrawal successful.");
                        break;

                    case "4":
                        System.out.print("Enter IBAN: ");
                        String balanceIban = scanner.nextLine();
                        BigDecimal balance = accountService.getBalance(balanceIban);
                        System.out.println("Balance: " + balance);
                        break;

                    case "5":
                        List<AccountReadOnlyDTO> accounts = accountService.getAccounts();
                        if (accounts.isEmpty()) {
                            System.out.println("No accounts found.");
                        } else {
                            accounts.forEach(System.out::println);
                        }
                        break;

                    case "6":
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NegativeAmountException | BalanceOvercomeException | AccountNotFoundException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please enter a valid amount.");
            }
        }
    }
}


