package TestHW2;

import HW2.ShortestWord;
import org.junit.Assert;
import org.junit.Test;

public class TestShortestWord {
    @Test
    public void testShortestWord_count_lala(){
        int exp = 1;
        int act = ShortestWord.count("lala") ;
        Assert.assertEquals(exp, act);
    }
    @Test
    public void testShortestWord_count_lala_tra_la_la(){
        int exp = 4;
        int act = ShortestWord.count("lala tra la la") ;
        Assert.assertEquals(exp, act);
    }
    @Test (expected = NullPointerException.class)
    public void testShortestWord_count_null(){
        ShortestWord.count(null) ;
    }
}
