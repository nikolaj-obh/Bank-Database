package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.BankTransaction;
import org.springframework.data.repository.CrudRepository;

public interface BankTransactionRepository extends CrudRepository<BankTransaction, Long> {
}
