package dk.nikolaj.webbanking.datasource.neo4j.repositories;

import dk.nikolaj.webbanking.datasource.neo4j.model.Branch;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository("Neo4jBranchRepository")
public interface BranchRepository extends Neo4jRepository<Branch,Long> {
}
