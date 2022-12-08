package dk.nikolaj.webbanking.datasource.mongodb.service.interfaces;

import dk.nikolaj.webbanking.datasource.mongodb.model.Branch;

import java.util.List;

public interface BranchService {

    List<Branch> listAllBranches();

    Branch getBranch(Long id);

    void saveBranch(Branch branch);

    void deleteBranch(Long id);
}
