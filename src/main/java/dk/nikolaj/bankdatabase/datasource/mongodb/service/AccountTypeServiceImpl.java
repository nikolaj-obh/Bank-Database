package dk.nikolaj.bankdatabase.datasource.mongodb.service;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.AccountType;
import dk.nikolaj.bankdatabase.datasource.mongodb.repositories.AccountTypeRepository;
import dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces.AccountTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoAccountTypeServiceImpl")
public class AccountTypeServiceImpl implements AccountTypeService {

    private final AccountTypeRepository accountTypeRepository;

    public AccountTypeServiceImpl(AccountTypeRepository accountTypeRepository) {
        this.accountTypeRepository = accountTypeRepository;
    }

    public List<AccountType> listAllAccountTypes() {
        return accountTypeRepository.findAll();
    }

    public AccountType getAccountType(Long id) {
        return accountTypeRepository.findById(id).get();
    }

    public void saveAccountType(AccountType accountType) {
        accountTypeRepository.save(accountType);
    }

    public void deleteAccountType(Long id) {
        accountTypeRepository.deleteById(id);
    }
}
