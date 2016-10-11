package projects;

import java.util.Scanner;

/**
 * Created by doneal on 9/19/2016.
 */
public class PigLatin {

    public PigLatinGui gui = new PigLatinGui();

    public static final double VERSION = .1;

    static String makeRegular(String word){
        if(word.endsWith("ay")){
            String realMain = word.substring(0,(word.length()-2));
            String firstLetter = realMain.substring(realMain.length()-1);

            return(firstLetter+realMain.substring(0,realMain.length()-1));
        }

    else{
            return"Word not in PigLatin Format";
        }

    }
    static String makePigLatin(String word){

        String first = word.substring(0,1);

        String main = word.substring(1);

        return (main+first+"ay");
    }


    static String[] makePigLatin(String[] word, String[] ordway){
        for (int i = 0; i < word.length; i++) {
            ordway[i] = makePigLatin(word[i]);

        }
        return ordway;
    }
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);

//        String[] pigLatins = {"piggie", "latin", "usecase", "here", "pigLatin", "here"};
//        String[] latinPigs = new String[5];
//
//        try {
//            makePigLatin(pigLatins, latinPigs);
//        } catch (ArrayIndexOutOfBoundsException ex) {
//
//            System.out.println("The Array was too large");
//        }
//
//
//        for (int i = 0; i < latinPigs.length; i++) {
//            System.out.println(latinPigs[i]);
//
//        }

        System.out.println("======== PigLatin Translator v."+VERSION+"==========");
        System.out.println("Type 'translate' to reverse PigLatin");
        System.out.println("Or 'pig' to translate to PigLatin");
        System.out.println("=====================================================");


Scanner translate = new Scanner(System.in);
       boolean stop=false;
        if(translate.next().equals("translate")) {

            System.out.println("\n\nEnter the word(s) you wish to reverse:");
            System.out.println("If you're done type 'stop'");
            while (!stop) {

                String nextWord = words.next();
                if (nextWord.equals("stop")) {
                    stop = true;
                } else {
                    System.out.println(makeRegular(nextWord));
                }

            }
        }
        else{
            System.out.println("\n\nType in words you wish to be translated into PigLatin");
            System.out.println("======= When you're done press enter to translate=====");
            System.out.println("============== Type 'stop' to terminate=============");
            System.out.println("=====================================================");
            while (!stop){
            String nextWord = words.next();
            if(nextWord.equals("stop")) {
                stop = true;
            }

            else{
                System.out.println(makePigLatin(nextWord));
            }

        }}


    }

}
