package dk.nikolaj.bankdatabase.datasource.mongodb.service;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.BankTransaction;
import dk.nikolaj.bankdatabase.datasource.mongodb.repositories.BankTransactionRepository;
import dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces.BankTransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoBankTransactionServiceImpl")
public class BankTransactionServiceImpl implements BankTransactionService {

    private final BankTransactionRepository bankTransactionRepository;

    public BankTransactionServiceImpl(BankTransactionRepository bankTransactionRepository) {
        this.bankTransactionRepository = bankTransactionRepository;
    }

    public List<BankTransaction> listAllBankTransactions() {
        return bankTransactionRepository.findAll();
    }

    public BankTransaction getBankTransaction(Long id) {
        return bankTransactionRepository.findById(id).get();
    }

    public void saveBankTransaction(BankTransaction bankTransaction) {
        bankTransactionRepository.save(bankTransaction);
    }

    public void deleteBankTransaction(Long id) {
        bankTransactionRepository.deleteById(id);
    }
}
