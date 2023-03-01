package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Node("cc_transactions")
public class CardTransaction {

    @Id
    @GeneratedValue
    private Long ID;
    @Property(name = "card_number")
    private String CardNumber;
    @Property(name = "transaction_date")
    private Date transactionDate;
    @Property(name = "amount")
    private BigDecimal amount;
    @Property(name = "merchant_details")
    private String merchantDetails;
}
