package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.CardTransaction;
import org.springframework.data.repository.CrudRepository;

public interface CardTransactionRepository extends CrudRepository<CardTransaction, Long> {
}
