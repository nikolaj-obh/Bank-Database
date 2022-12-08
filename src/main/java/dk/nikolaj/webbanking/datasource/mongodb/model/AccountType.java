package dk.nikolaj.webbanking.datasource.mongodb.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Document(collection = "account_type")
public class AccountType {

    @Id
    private String accountType;
    private BigDecimal minimumBalanceRestriction;
}
