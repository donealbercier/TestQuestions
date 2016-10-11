package examples;

/**
 * Created by doneal on 9/8/2016.
 */
public class Circle {

    private String[] validColors = {"red", "orange", "yellow", "green","blue","violet","indigo","purple"};

    private double radius =0;
    private String color ="white";

    //===========Constructors=============================

    public Circle(){}

    public Circle(double startRadius){
        radius = startRadius;
    }

    public Circle(double startRadius, String startColor){
        radius = startRadius;
        color = startColor;
    }

    //==============================================


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        boolean isValid=false;
        for(int i = 0; i<validColors.length;i++){
            if(color.equals(validColors[i])){
                isValid = true;
            }
        }
        if(isValid == true){
            this.color = color;
        }
        else{
            throw new IllegalArgumentException("Not a recognized color");
        }
    }
    //=======================================================================

    public String toString(){
        return("Radius: "+this.radius +" Color: "+this.color);
    }

    public double getArea(){
        return (radius*radius)*Math.PI;
    }


}
