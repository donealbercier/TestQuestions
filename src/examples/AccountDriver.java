package examples;
import java.lang.*;
/**
 * Created by doneal on 9/8/2016.
 */
public class AccountDriver {

    public static void main(String[] args){

        //==============================================

        SavingsAcount s1 = new SavingsAcount(2678, 300, 300, 15, 10);

        //------------------------------------
        Account a1 = new Account();

        System.out.println(a1);

        Account a2 = new Account(2345, 190.5, 100, 5);

        System.out.println(a2);

        a2.credit(100);

        System.out.println(a2);

        System.out.println(s1);

        //a2.debit(700);
        //this would cause the program to abort abrubtly

        try{
            a2.debit(700);
            System.out.println(a2);
        }
        catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }

        System.out.println("This will run after the catch statement");

        System.out.println("The interest over 6 months on a balance of "+a2.getBalance()+" at 5% is: "+a2.calculateInterestEarnings(6));
    }


}
