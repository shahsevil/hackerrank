package ProblemSolving.warmup;

import java.util.Arrays;

public class AppleAndOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        long countAp = Arrays.stream(apples).filter(ap -> ap + a >= s && ap + a <= t).count();
        long countOr = Arrays.stream(oranges).filter(or -> or + b >= s && or + b <= t).count();
        System.out.printf("%d\n%d", countAp, countOr);
    }
}
