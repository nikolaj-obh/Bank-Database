package dk.nikolaj.bankdatabase.datasource.mongodb.repositories;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.BankTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("MongoBankTransactionRepository")
public interface BankTransactionRepository extends MongoRepository<BankTransaction, Long> {
}
