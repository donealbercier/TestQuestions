package examples.ClassExamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doneal on 9/27/2016.
 */
public class DataTypes {

    public static void main(String[] args) {
        //========= Primatives =========
        boolean isTrue = true;
        char letter = 'a';
        byte one = 1;
        short notHuge = 3000;
        int prettyBig = 2000000000;
        long tremendous = 800000000;
        float fraction = 5/3;
        double decimal = 3.5;
        //===============================

        //======== Arrays(Collection)=====
        int[] intArray = new int[10];
        char[] charArray = new char[5];

        String[] Alphabet = {"a","b","c","d","e"};

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;

        for(String str:Alphabet){
            System.out.print(str+" ");

        }
        System.out.println();
        //------------- ArrayLists -----------------
        List<Integer> newList = new ArrayList<Integer>();
        for(int i = 0; i<100;i++){
            newList.add(i, i);
        }
        for(int here:newList){
            System.out.print(here+" ");
        }

        //==========================================
    }
}
