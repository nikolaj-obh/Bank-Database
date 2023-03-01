package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;

import java.math.BigDecimal;

@Getter
@Setter
@Node("account_type")
public class AccountType {

    @Id
    @Property(name = "account_type")
    private String accountType;
    @Property(name = "minimum_balance_restriction")
    private BigDecimal minimumBalanceRestriction;
}
