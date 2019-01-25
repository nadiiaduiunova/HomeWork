package HW2;

public class ChangeParts {
    public static int[] change (int [] firstMassive){
        int [] secondMassive = new int [firstMassive.length];
        if (firstMassive.length < 2){
            throw new IllegalArgumentException();
        }
        if (firstMassive.length%2 == 0){
            for (int i = 0; i < (firstMassive.length / 2); i++ ) {
                secondMassive [i] = firstMassive [firstMassive.length / 2 + i ];
            }
            for (int i = firstMassive.length/2 ; i < firstMassive.length; i++ ) {
                secondMassive[i] = firstMassive [i - firstMassive.length/2];
            }
        }
        else {
            for (int i = 0; i < (firstMassive.length / 2); i++ ) {
                secondMassive [i] = firstMassive [firstMassive.length / 2 + i + 1];
            }
            for (int i = firstMassive.length/2 + 1 ; i < firstMassive.length; i++ ) {
                secondMassive[i] = firstMassive [i - (firstMassive.length/2 + 1)];
            }
            secondMassive[secondMassive.length/2] = firstMassive[firstMassive.length/2];

        }
        return secondMassive;
    }
}
