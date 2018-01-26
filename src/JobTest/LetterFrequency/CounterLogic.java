package JobTest.LetterFrequency;

import java.sql.Array;
import java.util.Scanner;

/**
 * Created by doneal on 11/18/2016.
 */
public class CounterLogic {

    int aCounter = 0;
    int bCounter = 0;
    int cCounter = 0;
    int dCounter = 0;
    int eCounter = 0;

    int fCounter = 0;
    int gCounter = 0;
    int hCounter = 0;
    int iCounter = 0;
    int jCounter = 0;
    int kCounter = 0;
    int lCounter = 0;
    int mCounter = 0;
    int nCounter = 0;
    int oCounter = 0;
    int pCounter = 0;
    int qCounter = 0;
    int rCounter = 0;
    int sCounter = 0;
    int tCounter = 0;
    int uCounter = 0;
    int vCounter = 0;
    int wCounter = 0;
    int xCounter = 0;
    int yCounter = 0;
    int zCounter = 0;




    public void countLetters(String stream){



        stream.toLowerCase();

        Scanner scan = new Scanner(stream);

        while(scan.hasNext()){
            String nextWord = scan.next();
            for(int i = 0; i <nextWord.length(); i++){
                map(nextWord.charAt(i));
            }


    }


    }

    public void map(char c){

        switch(c) {
            case ('a'):
                aCounter++;
            case('b'):
                bCounter++;
            case ('c'):
                cCounter++;
            case('d'):
                dCounter++;
            case ('e'):
                eCounter++;
            case('f'):
                fCounter++;
            case ('g'):
                gCounter++;
            case('h'):
                hCounter++;
            case ('i'):
                iCounter++;
            case('j'):
                jCounter++;
            case ('k'):
                kCounter++;
            case('l'):
                lCounter++;
            case ('m'):
                mCounter++;
            case('n'):
                nCounter++;
            case ('o'):
                oCounter++;
            case('p'):
                pCounter++;
            case ('q'):
                qCounter++;
            case('r'):
                rCounter++;
            case('s'):
                sCounter++;
            case ('t'):
                tCounter++;
            case('u'):
                uCounter++;
            case('v'):
                vCounter++;
            case ('w'):
                wCounter++;
            case('x'):
                xCounter++;
            case('y'):
                yCounter++;
            case ('z'):
                zCounter++;








        }
    }

     public static void main(String[] args){
         System.out.println();

     }


}
