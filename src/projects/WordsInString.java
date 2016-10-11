package projects;

import java.util.Scanner;

/**
 * Created by doneal on 9/19/2016.
 */
public class WordsInString {

    public static Scanner findString = new Scanner(System.in);

    public static void main(String[] args) {

        int countStrings = 0;

        boolean areStrings = true;
        while(areStrings)
        {
            if(findString.hasNext())
            countStrings++;


            else{
                areStrings= false;
            }
        }

        System.out.println(countStrings);

    }
}
