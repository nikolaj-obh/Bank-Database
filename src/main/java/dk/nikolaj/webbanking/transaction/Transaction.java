package dk.nikolaj.webbanking.transaction;

import java.math.BigDecimal;
import java.util.Date;

public class Transaction {

    private Long senderID;
    private Long receiverID;
    private BigDecimal amount;
    private Date transactionDate;

    public Transaction(
            Long senderID,
            Long receiverID,
            BigDecimal amount,
            Date transactionDate
    ) {
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.amount = amount;
        this.transactionDate = transactionDate;
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
