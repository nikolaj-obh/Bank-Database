package dk.nikolaj.webbanking.datasource.neo4j.repositories;

import dk.nikolaj.webbanking.datasource.neo4j.model.AccountType;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jAccountTypeRepository")
public interface AccountTypeRepository extends Neo4jRepository<AccountType, String> {
}
