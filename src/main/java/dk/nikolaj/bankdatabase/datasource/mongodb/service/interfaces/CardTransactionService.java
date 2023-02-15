package dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.CardTransaction;

import java.util.List;

public interface CardTransactionService {

    List<CardTransaction> listAllCardTransactions();

    CardTransaction getCardTransaction(Long id);

    void saveCardTransaction(CardTransaction cardTransaction);

    void deleteCardTransaction(Long id);
}
