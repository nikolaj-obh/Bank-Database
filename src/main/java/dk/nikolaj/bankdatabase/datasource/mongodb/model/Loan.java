package dk.nikolaj.bankdatabase.datasource.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Document(collection = "loans")
public class Loan {

    @Id
    private Long ID;
    private BigDecimal durationInYears;
    private Date loanStartDate;
    private BigDecimal interestRate;
    private BigDecimal loanAmountTaken;
    private BigDecimal loanAmountRepaid;
    private String loanType;

    @DBRef
    private Customer customer;
}
