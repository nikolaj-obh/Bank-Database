package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch,Long> {
}
