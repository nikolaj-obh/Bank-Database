package dk.nikolaj.webbanking.datasource.mongodb.repositories;

import dk.nikolaj.webbanking.datasource.mongodb.model.BankTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("MongoBankTransactionRepository")
public interface BankTransactionRepository extends MongoRepository<BankTransaction, Long> {
}
