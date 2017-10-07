package sofe.exercise1;

import org.apache.commons.lang.ArrayUtils;

public class ContinuousArray {

    public static boolean isAlmostIncreasingSequence(int[] sequence) {

        int cont = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            System.out.print(sequence[i]);
            System.out.print(sequence[i+1]);

            if (sequence[i] > sequence[i + 1]) {
                cont++;
            }
        }

        if (cont <= 1) {
            return true;

        } else {
            return false;
        }

    }

}
