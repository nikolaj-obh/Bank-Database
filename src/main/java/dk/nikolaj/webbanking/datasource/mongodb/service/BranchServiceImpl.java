package dk.nikolaj.webbanking.datasource.mongodb.service;

import dk.nikolaj.webbanking.datasource.mongodb.model.Branch;
import dk.nikolaj.webbanking.datasource.mongodb.repositories.BranchRepository;
import dk.nikolaj.webbanking.datasource.mongodb.service.interfaces.BranchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoBranchServiceImpl")
public class BranchServiceImpl implements BranchService {

    private final BranchRepository branchRepository;

    public BranchServiceImpl(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }

    public List<Branch> listAllBranches() {
        return branchRepository.findAll();
    }

    public Branch getBranch(Long id) {
        return branchRepository.findById(id).get();
    }

    public void saveBranch(Branch branch) {
        branchRepository.save(branch);
    }

    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }
}
