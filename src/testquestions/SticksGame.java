package testquestions;

/**
 * Created by doneal on 9/12/2016.
 */
public class SticksGame {

    public static void main(String[] args) {

        int palindromeNum = 123454321;

        String palindromeStr = Integer.toString(palindromeNum);

        boolean isPalindrome = false;

        String reversePalindrome = "";

        for(int i = palindromeStr.length()-1; i>=0;i--){
            reversePalindrome = reversePalindrome + palindromeStr.charAt(i);
        }


        if(palindromeStr.equals(reversePalindrome)){
            isPalindrome = true;
        }

        System.out.println(reversePalindrome + " " + palindromeStr + " " + isPalindrome);
    }


}
