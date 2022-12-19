package dk.nikolaj.webbanking.datasource.mongodb.service.interfaces;

import dk.nikolaj.webbanking.datasource.mongodb.model.AccountType;

import java.util.List;

public interface AccountTypeService {

    List<AccountType> listAllAccountTypes();

    AccountType getAccountType(Long id);

    void saveAccountType(AccountType accountType);

    void deleteAccountType(Long id);
}
