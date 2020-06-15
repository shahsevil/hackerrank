package ProblemSolving.warmup;

import java.util.Arrays;

public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min += arr[i];
            max += arr[i + 1];
        }
        System.out.printf("%d %d", min, max);
    }

    public static void main(String[] args) {
        int[] arr = {7, 69, 2, 221, 8974};
        miniMaxSum(arr);
    }
}
