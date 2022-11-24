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
@Table(name = "bank_transactions")
public class BankTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionID;
    @Column(name = "transaction_type")
    private String transactionType;
    @Column(name = "description")
    private String description;
    @Column(name = "amount")
    private BigDecimal amount;
    @Column(name = "transaction_date")
    private Date transactionDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
