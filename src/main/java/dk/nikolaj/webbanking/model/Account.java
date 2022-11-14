package dk.nikolaj.webbanking.model;

import java.math.BigDecimal;

public class Account {

    //TODO rewrite to match db
    private Long ID;
    private String accountName;
    private Long accountNumber;
    private Long customerID;
    private BigDecimal balance;

    public Account(
            Long ID,
            String accountName,
            Long accountNumber,
            Long customerID,
            BigDecimal balance
    ) {
        this.ID = ID;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.balance = balance;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
