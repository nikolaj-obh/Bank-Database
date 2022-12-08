package dk.nikolaj.webbanking.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Node("cc_transactions")
public class CardTransaction {

    @Id
    @GeneratedValue
    private Long ID;
    private String CardNumber;
    private Date transactionDate;
    private BigDecimal amount;
    private String merchantDetails;
}
