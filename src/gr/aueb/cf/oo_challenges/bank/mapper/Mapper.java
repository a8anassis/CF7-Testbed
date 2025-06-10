package gr.aueb.cf.oo_challenges.bank.mapper;

import gr.aueb.cf.oo_challenges.bank.dto.AccountInsertDTO;
import gr.aueb.cf.oo_challenges.bank.model.Account;
import gr.aueb.cf.oo_challenges.bank.service.AccountServiceImpl;

import java.util.Map;

public class Mapper {

    private Mapper() {

    }

    public static Account mapToModelEntity(AccountInsertDTO dto) {
        return new Account(dto.getIBAN(), dto.getBalance());
    }
}
