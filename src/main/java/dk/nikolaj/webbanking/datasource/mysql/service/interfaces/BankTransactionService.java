package dk.nikolaj.webbanking.datasource.mysql.service.interfaces;

import dk.nikolaj.webbanking.datasource.mysql.model.BankTransaction;

import java.util.List;

public interface BankTransactionService {

    List<BankTransaction> listAllBankTransactions();

    BankTransaction getBankTransaction(Long id);

    void saveBankTransaction(BankTransaction bankTransaction);

    void deleteBankTransaction(Long id);
}
