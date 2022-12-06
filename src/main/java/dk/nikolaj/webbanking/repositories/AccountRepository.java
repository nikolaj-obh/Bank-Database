package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
