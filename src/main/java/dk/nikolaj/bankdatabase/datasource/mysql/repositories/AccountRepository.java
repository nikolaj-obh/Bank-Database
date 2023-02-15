package dk.nikolaj.bankdatabase.datasource.mysql.repositories;

import dk.nikolaj.bankdatabase.datasource.mysql.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
