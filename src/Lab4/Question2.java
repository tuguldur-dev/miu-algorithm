package Lab4;

import java.util.List;

public class Question2 {
    public static void main() {
        int[] input = {3, 4, 7, 8};
        int  k  = 15;
        IO.println("a. True or False: "+ Question1.isSubsetSum(input, k));

        List<Integer> one = Question1.findOneSubset(input, k);
        System.out.println("b. One solution: " + (one != null ? one : "No solution"));

        List<List<Integer>> all = Question1.findAllSubsets(input, k);

        System.out.println("c. All solutions: " + (all.isEmpty() ? "No solution" : all));

    }
}
