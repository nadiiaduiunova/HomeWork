package TestHW2;

import HW2.BubbleSort;
import HW2.ChangeParts;
import org.junit.Assert;
import org.junit.Test;

public class TestBubbleSort {
    @Test
    public void testBubbleSort_sorting_12345 (){
        int[] exp = {1,2,3,4,5};
        int [] act = BubbleSort.sorting(new int[]{5, 2, 4, 1, 3});
        Assert.assertArrayEquals(exp, act);
    }
    @Test (expected = NullPointerException.class)
    public void testBubbleSort_sorting_null (){
        BubbleSort.sorting(null);
    }
    @Test
    public void testBubbleSort_sorting_5 (){
        int[] exp = {5};
        int [] act = BubbleSort.sorting(new int[]{5});
        Assert.assertArrayEquals(exp, act);
    }
}
