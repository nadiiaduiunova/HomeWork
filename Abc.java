package HW1;

import static HW1.Factorial.factorial;

public class Abc {
    public static double abc(double a, double b, double c) {
        if (c != 0) {
            if (a % 2 == 0) {
                return (a * b / c);
            } else if ((a + c) % 2 == 0 || (b + c) % 2 == 0) {
                return Math.pow(a, c);
            } else {
                return a + b - c;
            }
        } else {
            return 0;
        }
    }
}
