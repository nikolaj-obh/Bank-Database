package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Branch;
import org.springframework.data.repository.CrudRepository;

public interface BranchRepository extends CrudRepository<Branch,Long> {
}
