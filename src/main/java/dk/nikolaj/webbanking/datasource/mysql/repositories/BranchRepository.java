package dk.nikolaj.webbanking.datasource.mysql.repositories;

import dk.nikolaj.webbanking.datasource.mysql.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Long> {
}
