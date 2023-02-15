package dk.nikolaj.bankdatabase.datasource.mysql.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.mysql.model.Branch;

import java.util.List;

public interface BranchService {

    List<Branch> listAllBranches();

    Branch getBranch(Long id);

    void saveBranch(Branch branch);

    void deleteBranch(Long id);
}
