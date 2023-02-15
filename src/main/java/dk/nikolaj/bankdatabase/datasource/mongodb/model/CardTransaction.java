package dk.nikolaj.bankdatabase.datasource.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Document(collection = "cc_transactions")
public class CardTransaction {

    @Id
    private Long ID;
    private String CardNumber;
    private Date transactionDate;
    private BigDecimal amount;
    private String merchantDetails;
}
