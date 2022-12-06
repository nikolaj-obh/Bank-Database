package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {
}
