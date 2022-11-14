package dk.nikolaj.webbanking.model;

import java.math.BigDecimal;
import java.util.Date;

public class Card {

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
}
