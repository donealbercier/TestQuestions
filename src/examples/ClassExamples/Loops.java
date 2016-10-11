package examples.ClassExamples;

/**
 * Created by doneal on 9/27/2016.
 */
public class Loops {

    //========= Utility Methods(STATIC)===========

    public static int countLetters(String word, char letter){
        //We will use the 'toLowerCase()' method on word
        //in order to find all letters regardless of Case

        //Remember Variables inside of methods can not
        //be static as they are made and exist only in the
        //method

        word = word.toLowerCase();
        int numOfLetters = 0;

        //We use the < operator because length() will always
        //be one more than the last index in the String
        for(int i = 0; i < word.length(); i++){

            //Beause char is a primitive data type
            //It comes with an overloaded == operator
            if(word.charAt(i)==letter){

                //Whenever we find a letter we will update
                //the number of letters by one
                numOfLetters++;
            }
        }


        return numOfLetters;
    }
//-----------------------------------------------------
    public static String codeSplosion(String word){
        //In this method we will use the 'while' loop
        //to generate a String as such:
        //Code -----> CCoCodCode
        //ABC -----> AABABC

        int length = 0;
        String splodedString = "";

        while(length<=word.length()){
        splodedString += word.substring(0,length);
            length++;
        }

        return splodedString;
    }
}
