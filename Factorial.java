package HW1;

public class Factorial {
    public static int factorial(int num_to_fac) {
        if (num_to_fac < 0) {
            return 0;
        } else if (num_to_fac == 0 || num_to_fac == 1) {
            return 1;
        }else {
            int res = 1;
            for (int i = 1; i <= num_to_fac; i++) {
                res = res * i;
            }
            return res;
        }
    }
}
