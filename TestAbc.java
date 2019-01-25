package TestHW1;

import HW1.Abc;
import org.junit.Assert;
import org.junit.Test;

public class TestAbc {
    @Test
    public void testAbc_abc_123 (){
        double exp = 1;
        double act = Abc.abc(1,2,3);
        Assert.assertEquals(exp, act, 0);
    }
    @Test
    public void testAbc_abc_233 (){
        double exp = 2;
        double act = Abc.abc(2,3,3);
        Assert.assertEquals(exp, act, 0);
    }
    @Test
    public void testAbc_abc_356 (){
        double exp = 2;
        double act = Abc.abc(3,5,6);
        Assert.assertEquals(exp, act, 0);
    }
    @Test
    public void testAbc_abc_350 (){
        double exp = 0;
        double act = Abc.abc(3,5,0);
        Assert.assertEquals(exp, act, 0);
}

}
