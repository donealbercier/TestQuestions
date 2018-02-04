package examples.ClassExamples;

/**
 * Created by doneal on 9/27/2016.
 */
public class StaticMethodsExamples {

    public static void main(String[] args) {

        //========== STATELESS METHOD =================
        boolean is4Odd = ClassWithStatic.checkIfOdd(4);

        System.out.println("4 is odd: "+is4Odd);
        //==========================================

        //========== STATEFUL METHOD ==================

        /*
        Here I will create two instances
        of the ClassWithStatic class to illustrate
        static variables
         */

        ClassWithStatic firstC = new ClassWithStatic("firstClass");
        ClassWithStatic secondC = new ClassWithStatic("secondClass");

        System.out.println(firstC.toString());
        System.out.println(secondC.toString());

        System.out.println("firstClass adds 5");
        ClassWithStatic.changeStaticNumber(5);
        System.out.println(firstC.toString());

        System.out.println("secondClass adds 40");
        ClassWithStatic.changeStaticNumber(40);
        System.out.println(secondC.toString());

        System.out.println(firstC.toString());
        System.out.println("The classes value is: "+ClassWithStatic.staticNumber);

    }
}
