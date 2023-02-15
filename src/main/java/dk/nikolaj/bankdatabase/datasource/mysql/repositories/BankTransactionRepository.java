package dk.nikolaj.bankdatabase.datasource.mysql.repositories;

import dk.nikolaj.bankdatabase.datasource.mysql.model.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {
}
