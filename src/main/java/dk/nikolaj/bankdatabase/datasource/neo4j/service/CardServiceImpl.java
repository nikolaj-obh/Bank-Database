package dk.nikolaj.bankdatabase.datasource.neo4j.service;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Card;
import dk.nikolaj.bankdatabase.datasource.neo4j.repositories.CardRepository;
import dk.nikolaj.bankdatabase.datasource.neo4j.service.interfaces.CardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jCardServiceImpl")
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
