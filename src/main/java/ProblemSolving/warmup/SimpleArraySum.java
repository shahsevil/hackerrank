package ProblemSolving.warmup;

import java.util.Arrays;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 10, 11};
        System.out.println(simpleArraySum(ar));
    }
}
