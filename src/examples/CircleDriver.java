package examples;

/**
 * Created by doneal on 9/9/2016.
 */
public class CircleDriver {

    public static void main(String[] args){

        Circle blueCircle = new Circle(10, "blue");

        System.out.println(blueCircle);

//----------------------------------------------------------
//        try{
//            blueCircle.setColor("black");
//        }
//        catch(   IllegalArgumentException ex){
//
//
//            ex.printStackTrace();
//        }

//        try{
//            blueCircle.setColor("red");
//        }
//        catch(IllegalArgumentException ex){
//            ex.printStackTrace();
//        }
//--------------------------------------------------------
        System.out.println(blueCircle);
        System.out.println("Area: "+blueCircle.getArea());
    }

}
