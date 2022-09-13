package dk.nikolaj.webbanking.account;

import java.math.BigDecimal;

public class Account {

    private Long ID;
    private String accountName;
    private Long accountNumber;
    private BigDecimal balance;

    public Account(
            Long ID,
            String accountName,
            Long accountNumber,
            BigDecimal balance
    ) {
        this.ID = ID;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
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
