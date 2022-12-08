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
@Node("accounts")
public class Account {

    @Id
    @GeneratedValue
    private Long ID;
    private BigDecimal accountBalance;
    private Date dateOpened;

    @Relationship
    private AccountType accountType;

    @Relationship
    private Branch branch;
}
