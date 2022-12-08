package dk.nikolaj.webbanking.datasource.mongodb.service;

import dk.nikolaj.webbanking.datasource.mongodb.model.Account;
import dk.nikolaj.webbanking.datasource.mongodb.repositories.AccountRepository;
import dk.nikolaj.webbanking.datasource.mongodb.service.interfaces.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoAccountServiceImpl")
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
