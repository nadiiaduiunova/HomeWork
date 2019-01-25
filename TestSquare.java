package TestHW1;

import HW1.Square;
import org.junit.Assert;
import org.junit.Test;

public class TestSquare {
    @Test
    public void testSquare_squareP_5 (){
        int exp = 20;
        int act = Square.squareP (5);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testSquare_squareS_5 (){
        int exp = 25;
        int act = Square.squareS (5);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testSquare_rectangleP_5_4 (){
        int exp = 18;
        int act = Square.rectangleP (5, 4);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testSquare_rectangleS_5_4 (){
        int exp = 20;
        int act = Square.rectangleS (5, 4);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testSquare_circleP_3 (){
        double exp = 2 * 3 * Math.PI;
        double act = Square.circleP (3);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testSquare_circleS_3 (){
        double exp = Math.pow(3, 2d)*Math.PI;
        double act = Square.circleS (3);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testSquare_triangleP_3_4_5 (){
        double exp = 12;
        double act = Square.triangleP (3, 4 ,5);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testSquare_triangleS_3_4_5 (){
        double exp = 6;
        double act = Square.triangleS (3, 4 ,5);
        Assert.assertEquals (exp, act, 0);
    }
}
