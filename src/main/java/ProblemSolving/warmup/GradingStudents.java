package ProblemSolving.warmup;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(gr -> {
            int rem = gr % 5;
            return gr >= 38 && rem >= 3 ? gr - rem + 5 : gr;
        }).collect(toList());
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(Arrays.asList(73,67,38 ,33)));
    }
}