package dk.nikolaj.webbanking.datasource.neo4j.model;

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
@Node("banking_transactions")
public class BankTransaction {

    @Id
    @GeneratedValue
    private Long transactionID;
    private String transactionType;
    private String description;
    private BigDecimal amount;
    private Date transactionDate;

    @Relationship
    private Customer customer;
}
