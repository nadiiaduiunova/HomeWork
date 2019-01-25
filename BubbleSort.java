package HW2;

public class BubbleSort {
    public static int[] sorting(int[] firstArray) {
        for (int i = firstArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (firstArray[j] > firstArray[j + 1]) {
                    int tmp = firstArray[j];
                    firstArray[j] = firstArray[j + 1];
                    firstArray[j + 1] = tmp;
                }
            }
        } return firstArray;
    }
}
