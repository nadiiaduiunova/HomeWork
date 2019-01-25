package TestHW1;

import HW1.Ticket;
import org.junit.Assert;
import org.junit.Test;

public class TestTicket {
    @Test
    public void testTicket_moneyToReturn_15() {
        double exp = 1000.0;
        double act = Ticket.moneyToReturn (15);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testTicket_moneyToReturn_10() {
        double exp = 1000.0;
        double act = Ticket.moneyToReturn (10);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testTicket_moneyToReturn_5() {
        double exp = 800.0;
        double act = Ticket.moneyToReturn (5);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testTicket_moneyToReturn_4() {
        double exp = 600.0;
        double act = Ticket.moneyToReturn (4);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testTicket_moneyToReturn_1() {
        double exp = 600.0;
        double act = Ticket.moneyToReturn (1);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testTicket_moneyToReturn_0() {
        double exp = 200.0;
        double act = Ticket.moneyToReturn (0);
        Assert.assertEquals (exp, act, 0);
    }
    @Test
    public void testTicket_moneyToReturn_m2() {
        double exp = 0.0;
        double act = Ticket.moneyToReturn (-2);
        Assert.assertEquals (exp, act, 0);
    }

}
