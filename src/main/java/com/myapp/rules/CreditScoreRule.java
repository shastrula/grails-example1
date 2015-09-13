package com.myapp.rules;

/**
 * Created by praveen on 9/12/2015.
 */
public class CreditScoreRule {
    private int creditScore;

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String rule100() {

        //If credit score is less than 530, reject
        if(creditScore <= 530) {
            return "Reject the Application";
        } //if credit score is between 530 and 700, approve with high rate
        else if(creditScore<=700) {
            return "Approve With High APR";
        }  else {
            return "Approve with Low APR";
        }
    }

}
