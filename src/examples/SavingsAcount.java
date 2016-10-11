package examples;

/**
 * Created by doneal on 9/8/2016.
 */
public class SavingsAcount extends Account {

    private int interestOfSavings=0;

    SavingsAcount(int accountNumber, double balance, double savings, double interestRate, int interestOfSavings)
    {
        super(accountNumber, balance, savings, interestRate);
        this.interestOfSavings = interestOfSavings;

    }


    public int getInterestOfSavings() {
        return interestOfSavings;
    }

    public void setInterestOfSavings(int interestOfSavings) {
        this.interestOfSavings = interestOfSavings;
    }


}
