package dk.nikolaj.bankdatabase.datasource.neo4j.service;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.BankTransaction;
import dk.nikolaj.bankdatabase.datasource.neo4j.repositories.BankTransactionRepository;
import dk.nikolaj.bankdatabase.datasource.neo4j.service.interfaces.BankTransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jBankTransactionServiceImpl")
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
