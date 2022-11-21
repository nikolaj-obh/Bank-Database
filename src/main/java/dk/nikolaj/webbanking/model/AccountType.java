package dk.nikolaj.webbanking.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class AccountType {

    @Id
    private String accountType;
    private BigDecimal minimumBalanceRestriction;
}
