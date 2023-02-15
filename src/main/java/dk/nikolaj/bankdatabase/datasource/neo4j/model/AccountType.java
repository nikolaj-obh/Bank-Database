package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;

import java.math.BigDecimal;

@Getter
@Setter
@Node("account_type")
public class AccountType {

    @Id
    private String accountType;
    private BigDecimal minimumBalanceRestriction;
}
