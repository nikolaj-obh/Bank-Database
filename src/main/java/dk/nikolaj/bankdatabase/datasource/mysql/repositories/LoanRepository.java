package dk.nikolaj.bankdatabase.datasource.mysql.repositories;

import dk.nikolaj.bankdatabase.datasource.mysql.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
