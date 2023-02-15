package dk.nikolaj.bankdatabase.datasource.mysql.repositories;

import dk.nikolaj.bankdatabase.datasource.mysql.model.CardTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardTransactionRepository extends JpaRepository<CardTransaction, Long> {
}
