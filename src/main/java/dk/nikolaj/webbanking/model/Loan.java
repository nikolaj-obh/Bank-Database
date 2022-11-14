package dk.nikolaj.webbanking.model;

import java.math.BigDecimal;
import java.util.Date;

public class Loan {

    private Long ID;
    private BigDecimal durationInYears;
    private Date loanStartDate;
    private BigDecimal interestRate;
    private BigDecimal loanAmountTaken;
    private BigDecimal loanAmountRepaid;
    private String loanType;
    private Long customerID;
}
