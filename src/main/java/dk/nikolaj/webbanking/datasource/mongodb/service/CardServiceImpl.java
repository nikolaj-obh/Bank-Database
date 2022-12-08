package dk.nikolaj.webbanking.datasource.mongodb.service;

import dk.nikolaj.webbanking.datasource.mongodb.model.Card;
import dk.nikolaj.webbanking.datasource.mongodb.repositories.CardRepository;
import dk.nikolaj.webbanking.datasource.mongodb.service.interfaces.CardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoCardServiceImpl")
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
