package examples.ClassExamples;

/**
 * Created by doneal on 9/27/2016.
 * @author doneal .
 * @return boolean.
 */
public class ClassWithStatic {
    //============== CLASS VARIABLES =======

    public static int staticNumber;

    //names are unique and shoule be possesed
    //by the objects therefore it's not static
    public String name = "";

    //=============== CONSTRUCTER ==========
    public ClassWithStatic(String name) {
        this.name = name;
    }

    //================ STATELESS(UTILITY) METHODS ======
    /*
        The method 'checkIfOdd' is static
        This means that I can access it
        without having to create an instance
        of the ClassWithStatic class
         */

    /**
     *
     * @param num Number we want to check. Assumes
     * @return boolean value
     */
    public static boolean checkIfOdd(int num){
        return num % 2 != 0;
    }

    @Override
    public String toString() {
        return "Name: "+name+"Static Variable Value: "+staticNumber;
    }

    //================ STATEFUL METHODS ===============
    public static void changeStaticNumber(int num){
        staticNumber += num;
    }



}
