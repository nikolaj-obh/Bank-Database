package dk.nikolaj.webbanking.model;

import java.math.BigDecimal;
import java.util.Date;

public class CardTransaction {

    private Long ID;
    private String CardNumber;
    private Date transactionDate;
    private BigDecimal amount;
    private String merchantDetails;
}
