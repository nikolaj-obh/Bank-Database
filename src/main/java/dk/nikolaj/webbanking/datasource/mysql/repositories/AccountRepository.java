package dk.nikolaj.webbanking.datasource.mysql.repositories;

import dk.nikolaj.webbanking.datasource.mysql.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
