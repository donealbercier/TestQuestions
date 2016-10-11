package examples.ClassExamples;

/**
 * Created by doneal on 9/27/2016.
 */
public class UsingLoops {

    public static void main(String[] args) {
        String word  = "eeeEEEEE";
        String toBeSploded = "HelloWorld";
        char letter = 'e';
        int numOfLetters = Loops.countLetters(word, letter);
        //We use static methods because there is no need
        //to instantiate an object when using utility methods

        //Most methods that come with the Java API
        //Are static, such as: Math.abs() or 'string'.length()
//==========================================================
        System.out.println("There are "+numOfLetters+" "
                + letter+"('s) in the String");
        System.out.println();
        System.out.println(toBeSploded+"------> "+Loops.codeSplosion(toBeSploded));
    }
}
