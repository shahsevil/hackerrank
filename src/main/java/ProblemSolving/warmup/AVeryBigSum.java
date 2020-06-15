package ProblemSolving.warmup;

import java.util.Arrays;

public class AVeryBigSum {
    static long aVeryBigSum(long[] ar) {
        return Arrays.stream(ar).sum();
    }

    public static void main(String[] args) {
        long[] arr = new long[]{1000000, 1000001, 1000002};
        System.out.println(aVeryBigSum(arr));
    }
}
