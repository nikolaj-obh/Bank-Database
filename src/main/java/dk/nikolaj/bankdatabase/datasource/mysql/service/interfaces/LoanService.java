package dk.nikolaj.bankdatabase.datasource.mysql.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.mysql.model.Loan;

import java.util.List;

public interface LoanService {

    List<Loan> listAllLoans();

    Loan getLoan(Long id);

    void saveLoan(Loan loan);

    void deleteLoan(Long id);
}
