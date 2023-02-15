package dk.nikolaj.bankdatabase.datasource.mongodb.service;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.Loan;
import dk.nikolaj.bankdatabase.datasource.mongodb.repositories.LoanRepository;
import dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces.LoanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoLoanServiceImpl")
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
