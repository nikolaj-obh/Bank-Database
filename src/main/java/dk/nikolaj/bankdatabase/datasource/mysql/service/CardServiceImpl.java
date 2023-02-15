package dk.nikolaj.bankdatabase.datasource.mysql.service;

import dk.nikolaj.bankdatabase.datasource.mysql.model.Card;
import dk.nikolaj.bankdatabase.datasource.mysql.repositories.CardRepository;
import dk.nikolaj.bankdatabase.datasource.mysql.service.interfaces.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class CardServiceImpl implements CardService {

    private final CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> listAllCards() {
        return cardRepository.findAll();
    }

    public Card getCard(Long id) {
        return cardRepository.findById(id).get();
    }

    public void saveCard(Card card) {
        cardRepository.save(card);
    }

    public void deleteCard(Long id) {
        cardRepository.deleteById(id);
    }
}
