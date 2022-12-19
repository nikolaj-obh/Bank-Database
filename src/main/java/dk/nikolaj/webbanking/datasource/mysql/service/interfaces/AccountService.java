package dk.nikolaj.webbanking.datasource.mysql.service.interfaces;

import dk.nikolaj.webbanking.datasource.mysql.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> listAllAccounts();

    Account getAccount(Long id);

    void saveAccount(Account account);

    void deleteAccount(Long id);
}
