package dk.nikolaj.webbanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class CardTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String CardNumber;
    private Date transactionDate;
    private BigDecimal amount;
    private String merchantDetails;

    public CardTransaction(Long ID, String cardNumber, Date transactionDate, BigDecimal amount, String merchantDetails) {
        this.ID = ID;
        CardNumber = cardNumber;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.merchantDetails = merchantDetails;
    }

    public CardTransaction() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getMerchantDetails() {
        return merchantDetails;
    }

    public void setMerchantDetails(String merchantDetails) {
        this.merchantDetails = merchantDetails;
    }
}
