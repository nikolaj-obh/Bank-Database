package dk.nikolaj.webbanking.datasource.mongodb.service;

import dk.nikolaj.webbanking.datasource.mongodb.model.CardTransaction;
import dk.nikolaj.webbanking.datasource.mongodb.repositories.CardTransactionRepository;
import dk.nikolaj.webbanking.datasource.mongodb.service.interfaces.CardTransactionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoCardTransactionServiceImpl")
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
