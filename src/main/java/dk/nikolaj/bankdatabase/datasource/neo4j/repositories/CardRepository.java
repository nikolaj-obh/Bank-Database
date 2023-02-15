package dk.nikolaj.bankdatabase.datasource.neo4j.repositories;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Card;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jCardRepository")
public interface CardRepository extends Neo4jRepository<Card, Long> {
}
