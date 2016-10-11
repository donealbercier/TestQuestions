package AreaCalculator;

/**
 * Created by doneal on 10/11/2016.
 */
public class Square {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    //==========================================
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {

        this.sideLength = (sideLength<0)?0.0:sideLength;
    }

    public double getArea() {
        return sideLength*sideLength;
    }

}
