package dk.nikolaj.webbanking.datasource.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Document(collection = "cards")
public class Card {

    // TODO implement maximum limit for credit card (eg. 25.000 dkk a month)
    @Id
    private Long ID;
    private String cardNumber;
    private BigDecimal maximumLimit;
    private Date expiryDate;

    @DBRef
    private Customer customer;
}
