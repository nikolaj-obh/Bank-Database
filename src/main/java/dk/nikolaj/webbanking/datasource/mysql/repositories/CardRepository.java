package dk.nikolaj.webbanking.datasource.mysql.repositories;

import dk.nikolaj.webbanking.datasource.mysql.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
