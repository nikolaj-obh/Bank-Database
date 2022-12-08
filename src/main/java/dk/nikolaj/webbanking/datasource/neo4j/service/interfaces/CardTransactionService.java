package dk.nikolaj.webbanking.datasource.neo4j.service.interfaces;

import dk.nikolaj.webbanking.datasource.neo4j.model.CardTransaction;

import java.util.List;

public interface CardTransactionService {

    List<CardTransaction> listAllCardTransactions();

    CardTransaction getCardTransaction(Long id);

    void saveCardTransaction(CardTransaction cardTransaction);

    void deleteCardTransaction(Long id);
}
