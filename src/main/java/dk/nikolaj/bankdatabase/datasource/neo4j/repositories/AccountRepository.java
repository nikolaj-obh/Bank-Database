package dk.nikolaj.bankdatabase.datasource.neo4j.repositories;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Account;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jAccountRepository")
public interface AccountRepository extends Neo4jRepository<Account, Long> {
}
