package dk.nikolaj.webbanking.datasource.neo4j.service;

import dk.nikolaj.webbanking.datasource.neo4j.model.Loan;
import dk.nikolaj.webbanking.datasource.neo4j.repositories.LoanRepository;
import dk.nikolaj.webbanking.datasource.neo4j.service.interfaces.LoanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jLoanServiceImpl")
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;

    public LoanServiceImpl(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> listAllLoans() {
        return loanRepository.findAll();
    }

    public Loan getLoan(Long id) {
        return loanRepository.findById(id).get();
    }

    public void saveLoan(Loan loan) {
        loanRepository.save(loan);
    }

    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}
