package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
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
    @Property(name = "duration_in_years")
    private BigDecimal durationInYears;
    @Property(name = "loan_start_date")
    private Date loanStartDate;
    @Property(name = "interest_rate")
    private BigDecimal interestRate;
    @Property(name = "loan_amount_taken")
    private BigDecimal loanAmountTaken;
    @Property(name = "loan_amount_repaid")
    private BigDecimal loanAmountRepaid;
    @Property(name = "loan_type")
    private String loanType;

    @Relationship(type = "HAS_LOAN", direction = Relationship.Direction.INCOMING)
    private Customer customer;
}
