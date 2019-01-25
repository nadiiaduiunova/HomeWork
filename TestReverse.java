package TestHW1;

import HW1.Reverse;
import org.junit.Assert;
import org.junit.Test;

public class TestReverse {
    @Test
    public void testReverse_reverse_1234 (){
        int[] exp = {4, 3, 2, 1};
        int[] act = Reverse.reverse(new int[] {1, 2, 3, 4});
        Assert.assertArrayEquals(exp, act);
    }
    @Test
    public void testReverse_reverse_1 (){
        int[] exp = {1};
        int[] act = Reverse.reverse(new int[] {1});
        Assert.assertArrayEquals(exp, act);
    }
    @Test (expected = NullPointerException.class)
    public void testReverse_reverse_null (){
        Reverse.reverse(null);
    }
}
