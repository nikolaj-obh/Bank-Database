package dk.nikolaj.webbanking.datasource.mongodb.repositories;

import dk.nikolaj.webbanking.datasource.mongodb.model.CardTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("MongoCardTransactionRepository")
public interface CardTransactionRepository extends MongoRepository<CardTransaction, Long> {
}
