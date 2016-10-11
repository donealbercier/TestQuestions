package testquestions;
//In order to use classes from different packages you must import it
import examples.Account;

/**
 * Created by doneal on 8/30/2016.
 */
public class FizzBizz {

    public String fizzBizzLogic(int n){
        if(((n%3)==0)&&((n%5)==0)){
            return "testquestions.FizzBizz";
        }

        else if((n%3)==0){
            return "Fizz";
        }

        else if((n%5)==0){
            return"Bizz";
        }
        else{
            return
        "Nun";
    }
    }



    public static void main(String[] args){
        //-----------Variables-----------------------
        Account a1 = new Account();
        FizzBizz biz = new FizzBizz();
        FizzBizz fiz = new FizzBizz();
        int[] fizzData = {15, 3, 5, 10, 30};
        //------------------------------------------

        for(int i = 0; i<fizzData.length; i++)
        {
            System.out.println("Input: "+fizzData[i]+"  Output:"+fiz.fizzBizzLogic(fizzData[i]));
        }

        if (fizzData.length==5) {
            System.out.println("length is 5");
        }

    }
}
