package gr.aueb.cf.oo_challenges.bank.mapper;

import gr.aueb.cf.oo_challenges.bank.dto.AccountInsertDTO;
import gr.aueb.cf.oo_challenges.bank.dto.AccountReadOnlyDTO;
import gr.aueb.cf.oo_challenges.bank.model.Account;

public class Mapper {

    private Mapper() {

    }

    public static Account mapToModelEntity(AccountInsertDTO dto) {
        return new Account(dto.getIBAN(), dto.getBalance());
    }

    public static AccountReadOnlyDTO mapToReadOnlyDTO(Account account) {
        return new AccountReadOnlyDTO(account.getIBAN(), account.getBalance());
    }
}
