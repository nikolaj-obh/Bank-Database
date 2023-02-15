package dk.nikolaj.bankdatabase.datasource.mysql.repositories;

import dk.nikolaj.bankdatabase.datasource.mysql.model.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
}
