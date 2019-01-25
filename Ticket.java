package HW1;

public class Ticket {
    public static double moneyToReturn ( int daysToFlight){
        int cost = 1000;
        double Return = 0;
        if (daysToFlight < 0) {
            Return = 0;
        } else if (daysToFlight < 1) {
            Return = cost * 0.2;
        } else if (daysToFlight < 5) {
            Return = cost * 0.6;
        } else if (daysToFlight < 10) {
            Return = cost * 0.8;
        } else {
            Return = cost;
        }
        return Return;
    }
}
