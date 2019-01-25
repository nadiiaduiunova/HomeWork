package TestHW2;

import HW2.ChangeParts;
import org.junit.Assert;
import org.junit.Test;

public class TestChangeParts {
    @Test
    public void testChangeParts_change_12345 (){
        int[] exp = {4,5,3,1,2};
        int [] act = ChangeParts.change(new int[]{1, 2, 3, 4, 5});
        Assert.assertArrayEquals(exp, act);
    }
    @Test
    public void testChangeParts_change_1234 (){
        int[] exp = {3,4,1,2};
        int [] act = ChangeParts.change(new int[]{1, 2, 3, 4});
        Assert.assertArrayEquals(exp, act);
    }
    @Test (expected = NullPointerException.class)
    public void testChangeParts_change_null (){
        ChangeParts.change(null);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testChangeParts_change_1 (){
        ChangeParts.change(new int []{1});
    }
    @Test (expected = IllegalArgumentException.class)
    public void testChangeParts_change_empty () {
        ChangeParts.change(new int[] {});
    }

}
