package dk.nikolaj.webbanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private BigDecimal durationInYears;
    private Date loanStartDate;
    private BigDecimal interestRate;
    private BigDecimal loanAmountTaken;
    private BigDecimal loanAmountRepaid;
    private String loanType;
    private Long customerID;

    public Loan(Long ID, BigDecimal durationInYears, Date loanStartDate, BigDecimal interestRate, BigDecimal loanAmountTaken, BigDecimal loanAmountRepaid, String loanType, Long customerID) {
        this.ID = ID;
        this.durationInYears = durationInYears;
        this.loanStartDate = loanStartDate;
        this.interestRate = interestRate;
        this.loanAmountTaken = loanAmountTaken;
        this.loanAmountRepaid = loanAmountRepaid;
        this.loanType = loanType;
        this.customerID = customerID;
    }

    public Loan() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public BigDecimal getDurationInYears() {
        return durationInYears;
    }

    public void setDurationInYears(BigDecimal durationInYears) {
        this.durationInYears = durationInYears;
    }

    public Date getLoanStartDate() {
        return loanStartDate;
    }

    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getLoanAmountTaken() {
        return loanAmountTaken;
    }

    public void setLoanAmountTaken(BigDecimal loanAmountTaken) {
        this.loanAmountTaken = loanAmountTaken;
    }

    public BigDecimal getLoanAmountRepaid() {
        return loanAmountRepaid;
    }

    public void setLoanAmountRepaid(BigDecimal loanAmountRepaid) {
        this.loanAmountRepaid = loanAmountRepaid;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }
}
