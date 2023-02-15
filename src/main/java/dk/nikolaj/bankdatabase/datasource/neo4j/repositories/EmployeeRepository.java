package dk.nikolaj.bankdatabase.datasource.neo4j.repositories;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Employee;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jEmployeeRepository")
public interface EmployeeRepository extends Neo4jRepository<Employee, Long> {
}
