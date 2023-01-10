package dk.nikolaj.bankdatabase.datasource.neo4j.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> listAllAccounts();

    Account getAccount(Long id);

    void saveAccount(Account account);

    void deleteAccount(Long id);
}
