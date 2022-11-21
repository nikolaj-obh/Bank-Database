package dk.nikolaj.webbanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class BankTransaction {

    //TODO rewrite to match db
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionID;
    private Long senderID;
    private Long receiverID;
    private BigDecimal amount;
    private Date transactionDate;

    public BankTransaction(
            Long transactionID,
            Long senderID,
            Long receiverID,
            BigDecimal amount,
            Date transactionDate
    ) {
        this.transactionID = transactionID;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public BankTransaction() {
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(Long transactionID) {
        this.transactionID = transactionID;
    }

    public Long getSenderID() {
        return senderID;
    }

    public void setSenderID(Long senderID) {
        this.senderID = senderID;
    }

    public Long getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(Long receiverID) {
        this.receiverID = receiverID;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
}
