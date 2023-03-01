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
@Node("banking_transactions")
public class BankTransaction {

    @Id
    @GeneratedValue
    private Long transactionID;
    @Property(name = "transaction_type")
    private String transactionType;
    @Property(name = "description")
    private String description;
    @Property(name = "amount")
    private BigDecimal amount;
    @Property(name = "transaction_date")
    private Date transactionDate;

    @Relationship(type = "HAS_TRANSACTION", direction = Relationship.Direction.OUTGOING)
    private Customer customer;
}
