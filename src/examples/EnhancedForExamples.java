package examples;

/**
 * Created by doneal on 9/24/2016.
 */
public class EnhancedForExamples {

    public static void main(String[] args) {
        Circle c1,c2,c3,c4;
        c1 = new Circle(1,"red");
        c2 = new Circle(2,"blue");
        c3 = new Circle(3,"yellow");
        c4 = new Circle();

        Circle[] myCircles = {c1,c2,c3,c4};

        for(Circle c: myCircles){
            if(c.getRadius()<=2){
                System.out.println("Ive doubled the radius");
                c.setRadius(c.getRadius()*2);
            }
        }
        for(Circle c: myCircles){
            System.out.println(c);
        }
    }
}
