package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.AccountType;
import org.springframework.data.repository.CrudRepository;

public interface AccountTypeRepository extends CrudRepository<AccountType, Long> {
}
