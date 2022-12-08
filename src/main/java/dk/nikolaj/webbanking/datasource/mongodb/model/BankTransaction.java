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
@Document(collection = "banking_transactions")
public class BankTransaction {

    @Id
    private Long transactionID;
    private String transactionType;
    private String description;
    private BigDecimal amount;
    private Date transactionDate;

    @DBRef
    private Customer customer;
}
