package dk.nikolaj.bankdatabase.datasource.neo4j.service;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Account;
import dk.nikolaj.bankdatabase.datasource.neo4j.repositories.AccountRepository;
import dk.nikolaj.bankdatabase.datasource.neo4j.service.interfaces.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jAccountServiceImpl")
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> listAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccount(Long id) {
        return accountRepository.findById(id).get();
    }

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
