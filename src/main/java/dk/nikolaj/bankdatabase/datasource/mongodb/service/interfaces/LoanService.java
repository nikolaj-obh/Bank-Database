package dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.Loan;

import java.util.List;

public interface LoanService {

    List<Loan> listAllLoans();

    Loan getLoan(Long id);

    void saveLoan(Loan loan);

    void deleteLoan(Long id);
}
