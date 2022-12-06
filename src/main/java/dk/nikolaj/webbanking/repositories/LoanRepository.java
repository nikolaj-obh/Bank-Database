package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
