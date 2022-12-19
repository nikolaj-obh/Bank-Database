package dk.nikolaj.webbanking.datasource.neo4j.repositories;

import dk.nikolaj.webbanking.datasource.neo4j.model.BankTransaction;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jBankTransactionRepository")
public interface BankTransactionRepository extends Neo4jRepository<BankTransaction, Long> {
}
