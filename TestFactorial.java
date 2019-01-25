package TestHW1;

import HW1.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class TestFactorial {
    @Test
    public void testFactorial_factorial_5 (){
        int exp = 120;
        int act = Factorial.factorial (5);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testFactorial_factorial_0 (){
        int exp = 1;
        int act = Factorial.factorial (0);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testFactorial_factorial_1 (){
        int exp = 1;
        int act = Factorial.factorial (1);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testFactorial_factorial_negative (){
        int exp = 0;
        int act = Factorial.factorial (-2);
        Assert.assertEquals (exp, act, 0);
    }
}
