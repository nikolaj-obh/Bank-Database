package dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> listAllAccounts();

    Account getAccount(Long id);

    void saveAccount(Account account);

    void deleteAccount(Long id);
}
