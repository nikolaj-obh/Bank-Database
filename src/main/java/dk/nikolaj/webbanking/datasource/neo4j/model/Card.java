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
@Node("cards")
public class Card {

    // TODO implement maximum limit for credit card (eg. 25.000 dkk a month)
    @Id
    @GeneratedValue
    private Long ID;
    private String cardNumber;
    private BigDecimal maximumLimit;
    private Date expiryDate;

    @Relationship
    private Customer customer;
}
