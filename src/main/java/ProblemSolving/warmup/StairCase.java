package ProblemSolving.warmup;

public class StairCase {
    static void staircase(int n) {
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(" ");
        }
        for (int i = 0; i < n; i++) {
            sb.setCharAt(n - counter, '#');
            counter++;
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        int n = 6;
        staircase(n);
    }
}
