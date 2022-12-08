package dk.nikolaj.webbanking.datasource.mongodb.service.interfaces;

import dk.nikolaj.webbanking.datasource.mongodb.model.CardTransaction;

import java.util.List;

public interface CardTransactionService {

    List<CardTransaction> listAllCardTransactions();

    CardTransaction getCardTransaction(Long id);

    void saveCardTransaction(CardTransaction cardTransaction);

    void deleteCardTransaction(Long id);
}
