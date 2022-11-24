package dk.nikolaj.webbanking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loans")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "loan_duration")
    private BigDecimal durationInYears;
    @Column(name = "start_date")
    private Date loanStartDate;
    @Column(name = "interest_rate")
    private BigDecimal interestRate;
    @Column(name = "amount_taken")
    private BigDecimal loanAmountTaken;
    @Column(name = "amount_repaid")
    private BigDecimal loanAmountRepaid;
    @Column(name = "loan_type")
    private String loanType;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
