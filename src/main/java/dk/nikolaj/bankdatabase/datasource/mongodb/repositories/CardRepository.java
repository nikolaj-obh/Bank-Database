package dk.nikolaj.bankdatabase.datasource.mongodb.repositories;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("MongoCardRepository")
public interface CardRepository extends MongoRepository<Card, Long> {
}
