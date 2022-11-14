package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
