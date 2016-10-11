package testquestions;

import static org.junit.Assert.*;

/**
 * Created by doneal on 9/2/2016.
 */
public class FizzBizzTest extends FizzBizz {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void fizzBizzLogic() throws Exception {

        int x = 15;
        int y = 9;
        FizzBizz fiz = new FizzBizz();

        String resultX = fiz.fizzBizzLogic(x);
        String resultY = fiz.fizzBizzLogic(y);

        assertEquals("testquestions.FizzBizz", resultX);
        assertEquals("Fizz", resultY);

    }

    @org.junit.Test
    public void main() throws Exception{
        FizzBizz biz = new FizzBizz();
    }


}