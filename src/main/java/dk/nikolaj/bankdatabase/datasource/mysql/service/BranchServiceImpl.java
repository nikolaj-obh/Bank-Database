package dk.nikolaj.bankdatabase.datasource.mysql.service;

import dk.nikolaj.bankdatabase.datasource.mysql.model.Branch;
import dk.nikolaj.bankdatabase.datasource.mysql.repositories.BranchRepository;
import dk.nikolaj.bankdatabase.datasource.mysql.service.interfaces.BranchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
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
