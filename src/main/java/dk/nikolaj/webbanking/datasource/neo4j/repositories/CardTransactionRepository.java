package dk.nikolaj.webbanking.datasource.neo4j.repositories;

import dk.nikolaj.webbanking.datasource.neo4j.model.CardTransaction;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jCardTransactionRepository")
public interface CardTransactionRepository extends Neo4jRepository<CardTransaction, Long> {
}
