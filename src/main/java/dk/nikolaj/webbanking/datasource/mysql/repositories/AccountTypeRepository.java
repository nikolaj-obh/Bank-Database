package dk.nikolaj.webbanking.datasource.mysql.repositories;

import dk.nikolaj.webbanking.datasource.mysql.model.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
}
