package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Node("loans")
public class Loan {

    @Id
    @GeneratedValue
    private Long ID;
    private BigDecimal durationInYears;
    private Date loanStartDate;
    private BigDecimal interestRate;
    private BigDecimal loanAmountTaken;
    private BigDecimal loanAmountRepaid;
    private String loanType;

    @Relationship
    private Customer customer;
}
