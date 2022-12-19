package dk.nikolaj.webbanking.datasource.neo4j.service;

import dk.nikolaj.webbanking.datasource.neo4j.model.Branch;
import dk.nikolaj.webbanking.datasource.neo4j.repositories.BranchRepository;
import dk.nikolaj.webbanking.datasource.neo4j.service.interfaces.BranchService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jBranchServiceImpl")
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
