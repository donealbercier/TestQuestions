package examples;

/**
 * Created by doneal on 9/8/2016.
 */
public class Account {
    private int accountNumber=0;
    private double balance=0;
    private double savings=0;
    private double interestRate=0;

    //=======================Constructors================
    public Account(){
        this.accountNumber = 1000;
        this.balance = 0.0;
        this.savings = 0.0;
        this.interestRate = 0;

    }

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public Account(int accountNumber, double balance, double savings, double interestRate)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.savings = savings;
        this.interestRate = interestRate;
    }



    //=======================Accessor Methods============
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 0) {
            this.balance = balance;
        }
        else{
            throw new IllegalArgumentException("Balance must be positive");
        }
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        if(balance > 0) {
            this.savings = savings;
        }
        else{
            throw new IllegalArgumentException("Savings must be positive");
        }

    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
//-----------------------------------------------------\\
//============================Action Methods========

    public void credit(double amount){
        this.balance += amount;
    }

    public void debit(double amount){
        if(amount>this.balance){
            throw new IllegalArgumentException("Cannot debit more than is in Account");
        }
        else{
            this.balance -= amount;
        }
    }

    public double calculateInterestEarnings(int month){
        double interestOverTime = 0;
        double balance = this.balance;
        for (int i = 0; i < month; i++) {
             interestOverTime = ((this.interestRate/100)*this.balance);
            balance += interestOverTime;
        }
        return interestOverTime;
    }

    @Override
    public String toString() {
        return ("Account Number = +"+this.accountNumber+"; Balance = "+this.balance+"; Savings"+this.savings );
    }
}
