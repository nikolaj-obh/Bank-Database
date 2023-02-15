package dk.nikolaj.bankdatabase.datasource.neo4j.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Card;

import java.util.List;

public interface CardService {

    List<Card> listAllCards();

    Card getCard(Long id);

    void saveCard(Card card);

    void deleteCard(Long id);
}
