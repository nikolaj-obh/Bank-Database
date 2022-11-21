package dk.nikolaj.webbanking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String cardNumber;
    private BigDecimal maximumLimit;
    private Date expiryDate;
    private Integer creditScore;
    private Long customerID;

    // TODO implement credit score
    //https://www.nerdwallet.com/article/finance/credit-score-ranges-and-how-to-improve
    //A score of 720 or higher is generally considered excellent credit.
    //A score between 690 and 719 is considered good credit.
    //Scores between 630 and 689 are fair credit.
    //And scores of 629 or below are poor credit.


    public Card(Long ID, String cardNumber, BigDecimal maximumLimit, Date expiryDate, Integer creditScore, Long customerID) {
        this.ID = ID;
        this.cardNumber = cardNumber;
        this.maximumLimit = maximumLimit;
        this.expiryDate = expiryDate;
        this.creditScore = creditScore;
        this.customerID = customerID;
    }

    public Card() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public BigDecimal getMaximumLimit() {
        return maximumLimit;
    }

    public void setMaximumLimit(BigDecimal maximumLimit) {
        this.maximumLimit = maximumLimit;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }
}
