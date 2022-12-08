package dk.nikolaj.webbanking.datasource.mongodb.repositories;

import dk.nikolaj.webbanking.datasource.mongodb.model.AccountType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("MongoAccountTypeRepository")
public interface AccountTypeRepository extends MongoRepository<AccountType, Long> {
}
