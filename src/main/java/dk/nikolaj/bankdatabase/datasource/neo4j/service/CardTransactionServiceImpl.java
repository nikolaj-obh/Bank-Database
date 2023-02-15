package dk.nikolaj.bankdatabase.datasource.neo4j.service;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.CardTransaction;
import dk.nikolaj.bankdatabase.datasource.neo4j.repositories.CardTransactionRepository;
import dk.nikolaj.bankdatabase.datasource.neo4j.service.interfaces.CardTransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jCardTransactionServiceImpl")
public class CardTransactionServiceImpl implements CardTransactionService {

    private final CardTransactionRepository cardTransactionRepository;

    public CardTransactionServiceImpl(CardTransactionRepository cardTransactionRepository) {
        this.cardTransactionRepository = cardTransactionRepository;
    }

    public List<CardTransaction> listAllCardTransactions() {
        return cardTransactionRepository.findAll();
    }

    public CardTransaction getCardTransaction(Long id) {
        return cardTransactionRepository.findById(id).get();
    }

    public void saveCardTransaction(CardTransaction cardTransaction) {
        cardTransactionRepository.save(cardTransaction);
    }

    public void deleteCardTransaction(Long id) {
        cardTransactionRepository.deleteById(id);
    }
}
