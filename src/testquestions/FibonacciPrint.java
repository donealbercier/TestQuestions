package testquestions;

import java.util.ArrayList;

/**
 * Created by doneal on 9/16/2016.
 */
public class FibonacciPrint {

    public int[] printFibonacci(int number) {
        int[] fibArray = new int[number];
        fibArray[0] = 0;
        fibArray[1] = 1;
        for (int i = 2; i < number; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
        int temp = 0;
        for (int i = 0; i < number; i++) {
            temp = fibArray[i];
            while(temp>0){
                System.out.print("-");
                temp--;
            }
            System.out.println("");

        }
        return fibArray;
    }
    public static void main(String[] args){
        FibonacciPrint fib = new FibonacciPrint();

        fib.printFibonacci(15);
    }
}
