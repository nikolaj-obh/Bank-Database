package dk.nikolaj.bankdatabase.datasource.neo4j.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.AccountType;

import java.util.List;

public interface AccountTypeService {

    List<AccountType> listAllAccountTypes();

    AccountType getAccountType(Long id);

    void saveAccountType(AccountType accountType);

    void deleteAccountType(Long id);
}
