package dk.nikolaj.webbanking.service.interfaces;

import dk.nikolaj.webbanking.model.Branch;

import java.util.List;

public interface BranchService {

    List<Branch> listAllBranches();

    Branch getBranch(Long id);

    void saveBranch(Branch branch);

    void deleteBranch(Long id);
}
