package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.CardTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardTransactionRepository extends JpaRepository<CardTransaction, Long> {
}
