package dk.nikolaj.webbanking.datasource.mongodb.service.interfaces;

import dk.nikolaj.webbanking.datasource.mongodb.model.Loan;

import java.util.List;

public interface LoanService {

    List<Loan> listAllLoans();

    Loan getLoan(Long id);

    void saveLoan(Loan loan);

    void deleteLoan(Long id);
}
