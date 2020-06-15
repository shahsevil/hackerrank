package ProblemSolving.warmup;

import java.util.Arrays;

public class PlusMinus {
    static void plusMinus(int[] arr) {
        int size = arr.length;
        double pos = Arrays.stream(arr).filter(el -> el > 0).count();
        double neg = Arrays.stream(arr).filter(el -> el < 0).count();
        double zero = Arrays.stream(arr).filter(el -> el == 0).count();
        System.out.println(pos / size);
        System.out.println(neg / size);
        System.out.println(zero / size);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }
}
