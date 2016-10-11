package testquestions;

/**
 * Created by doneal on 9/12/2016.
 */
public class Pyramid {
    private int baseSize =0;

    public Pyramid(){
        baseSize = 1;
    }

    public Pyramid(int baseSize){
        this.baseSize = baseSize;
    }

    public int getBaseSize() {
        return baseSize;
    }

    public void setBaseSize(int baseSize) {
        if(baseSize<1){
            throw new IllegalArgumentException("Pyramid base must be at leasr 1");
        }
        else {
            this.baseSize = baseSize;
        }
    }

    public void printPyramid(){
        for(int i =1; i<=baseSize; i++){
            for(int x = 0; x<i; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
