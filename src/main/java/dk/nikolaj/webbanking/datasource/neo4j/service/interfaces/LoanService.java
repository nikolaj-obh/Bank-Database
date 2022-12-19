package dk.nikolaj.webbanking.datasource.neo4j.service.interfaces;

import dk.nikolaj.webbanking.datasource.neo4j.model.Loan;

import java.util.List;

public interface LoanService {

    List<Loan> listAllLoans();

    Loan getLoan(Long id);

    void saveLoan(Loan loan);

    void deleteLoan(Long id);
}
