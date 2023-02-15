package dk.nikolaj.bankdatabase.datasource.neo4j.repositories;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Customer;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jCustomerRepository")
public interface CustomerRepository extends Neo4jRepository<Customer, Long> {
}
