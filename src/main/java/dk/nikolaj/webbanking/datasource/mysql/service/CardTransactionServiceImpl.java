package dk.nikolaj.webbanking.datasource.mysql.service;

import dk.nikolaj.webbanking.datasource.mysql.model.CardTransaction;
import dk.nikolaj.webbanking.datasource.mysql.repositories.CardTransactionRepository;
import dk.nikolaj.webbanking.datasource.mysql.service.interfaces.CardTransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
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
