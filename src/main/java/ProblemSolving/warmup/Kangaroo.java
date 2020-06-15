package ProblemSolving.warmup;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        return (v1 > v2 && ((x2 - x1) % (v1 - v2) == 0)) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 4;
        int v2 = 2;
        System.out.println(kangaroo(x1, v1, x2, v2));
    }
}
