package HW1;

public class Square {
    public static int squareP(int a) {
        return a * 4;
    }
    public static int squareS(int a) {
        return a * a;
    }
    public static int rectangleP (int a, int b) {
        return (a * 2 + b * 2);
    }
    public static int rectangleS (int a, int b) {
        return (a * b);
    }
    public static double circleP (double r) {
        return (2 * r * Math.PI);
    }
    public static double circleS (double r) {
        return (Math.pow(r, 2d)*Math.PI);
    }
    public static double triangleP (double m, double n, double k) {
        return (m + n + k);
    }
    public static double triangleS (double m, double n, double k) {
        double p = (m+n+k)/2;
        return (Math.sqrt(p*(p-m)*(p-n)*(p-k)));
    }
}
