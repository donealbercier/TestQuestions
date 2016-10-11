package testquestions;

/**
 * Created by doneal on 9/16/2016.
 */
public class PalindroneNumber {

    public static void main(String[] main){
        System.out.println(IsPalindrome3(1234321));
    }



    public static boolean IsPalindrome3(long number)
    {
// since the input is a number, one very fast way way would be
// to reverse the number and compare to original
        long revNum = ReverseNumber(number);

        return (number == revNum);
    }

    private static long ReverseNumber(long number)
    {
        long retVal = 0;
        do
        {
// get the last digit by using the modulo (remainder) operator
            retVal = (retVal * 10) + (number % 10);
// drop the last digit from the number
            number = number / 10;
        }
        while (number != 0);
        return retVal;
    }


}
