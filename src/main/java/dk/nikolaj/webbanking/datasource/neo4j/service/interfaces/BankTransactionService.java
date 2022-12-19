package dk.nikolaj.webbanking.datasource.neo4j.service.interfaces;

import dk.nikolaj.webbanking.datasource.neo4j.model.BankTransaction;

import java.util.List;

public interface BankTransactionService {

    List<BankTransaction> listAllBankTransactions();

    BankTransaction getBankTransaction(Long id);

    void saveBankTransaction(BankTransaction bankTransaction);

    void deleteBankTransaction(Long id);
}
