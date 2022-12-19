package dk.nikolaj.webbanking.datasource.mongodb.service.interfaces;

import dk.nikolaj.webbanking.datasource.mongodb.model.Card;

import java.util.List;

public interface CardService {

    List<Card> listAllCards();

    Card getCard(Long id);

    void saveCard(Card card);

    void deleteCard(Long id);
}
