package dk.nikolaj.webbanking.service;

import dk.nikolaj.webbanking.repositories.AccountRepository;
import dk.nikolaj.webbanking.service.interfaces.AccountService;

public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
}
