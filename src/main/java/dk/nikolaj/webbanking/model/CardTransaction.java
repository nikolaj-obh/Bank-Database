package dk.nikolaj.webbanking.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "card_transactions")
public class CardTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "card_number")
    private String CardNumber;
    @Column(name = "transaction_date")
    private Date transactionDate;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "merchant_details")
    private String merchantDetails;
}
