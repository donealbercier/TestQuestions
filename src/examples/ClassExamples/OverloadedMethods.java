package examples.ClassExamples;

/**
 * Created by doneal on 9/27/2016.
 */
public class OverloadedMethods {


    static <E> void print(E e){
        System.out.println("This is a "+e.getClass()+" "+e);

    }
    static <E> void print(E[] e){
        for (int i = 0; i < e.length; i++) {
            System.out.print(e[i]+" ");

        }
        System.out.println("");
    }



//   static void print(String word){
//        System.out.println("This is a string: "+word);
//    }
//    static void print(int num){
//        System.out.println("This is an integer: "+num);
//    }
//    static void print(double fraction){
//        System.out.println("This is a fraction: "+fraction);
//    }
//    static void print(char letter){
//        System.out.println("This is a character: "+letter);
//    }

    public static void main(String[] args) {
        String word = "String";
        int number = 20;
        double fraction = 5.4;
        char letter = 'a';

        String[] wordArray = {"word","secondWord", "thirdWord"};
        Integer[] intArray = {1,4,5,7};
        Double[] doubleArray = {3.2,4.3};

        print(word);
        print(number);
        print(fraction);
        print(letter);

        print(wordArray);
        print(intArray);
        print(doubleArray);
    }
}
