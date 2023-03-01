package dk.nikolaj.bankdatabase.datasource.neo4j.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@Node("accounts")
public class Account {

    @Id
    @GeneratedValue
    private Long ID;
    @Property(name = "account_balance")
    private BigDecimal accountBalance;
    @Property(name = "date_opened")
    private Date dateOpened;

    @Relationship(type = "HAS_ACCOUNT_TYPE")
    private AccountType accountType;

    @Relationship(type = "BELONGS_TO_BRANCH")
    private Branch branch;
}
