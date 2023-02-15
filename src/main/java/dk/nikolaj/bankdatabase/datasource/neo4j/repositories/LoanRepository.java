package dk.nikolaj.bankdatabase.datasource.neo4j.repositories;

import dk.nikolaj.bankdatabase.datasource.neo4j.model.Loan;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jLoanRepository")
public interface LoanRepository extends Neo4jRepository<Loan, Long> {
}
