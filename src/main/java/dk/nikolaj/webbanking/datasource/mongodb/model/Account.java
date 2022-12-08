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
@Document(collection = "accounts")
public class Account {

    @Id
    private Long ID;
    private BigDecimal accountBalance;
    private Date dateOpened;

    @DBRef
    private AccountType accountType;

    @DBRef
    private Branch branch;
}
