package dk.nikolaj.webbanking.datasource.neo4j.service.interfaces;

import dk.nikolaj.webbanking.datasource.neo4j.model.Branch;

import java.util.List;

public interface BranchService {

    List<Branch> listAllBranches();

    Branch getBranch(Long id);

    void saveBranch(Branch branch);

    void deleteBranch(Long id);
}
