package HW1;

public class Reverse {
    public static int[] reverse (int[] args) {
        int[] array = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = args[args.length-i-1];
        }
        return array;
    }
}
