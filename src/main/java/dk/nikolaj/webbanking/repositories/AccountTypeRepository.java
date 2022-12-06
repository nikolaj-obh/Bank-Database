package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {
}
