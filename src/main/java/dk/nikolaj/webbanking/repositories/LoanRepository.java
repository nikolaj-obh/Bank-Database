package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Loan;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Loan, Long> {
}
