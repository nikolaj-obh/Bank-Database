package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Card;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Long> {
}
