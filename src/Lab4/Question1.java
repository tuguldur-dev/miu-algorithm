package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static boolean isSubsetSum(int[] array, int sum) {
        int n = array.length;
        boolean[][] dp = new boolean[n+1][sum+1];

        for(int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= sum; k++) {
                if(k < array[i-1]) {
                    dp[i][k] = dp[i-1][k];
                } else {
                    dp[i][k] = dp[i-1][k] || dp[i-1][k-array[i-1]];
                }
            }
        }
        return dp[n][sum];
    }

    public static List<Integer> findOneSubset(int[] array, int sum) {
        int n = array.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= sum; k++) {
                if (k < array[i - 1]) {
                    dp[i][k] = dp[i - 1][k];
                } else {
                    dp[i][k] = dp[i - 1][k] || dp[i - 1][k - array[i - 1]];
                }
            }
        }

        if (!dp[n][sum]) return null;

        List<Integer> result = new ArrayList<>();
        int k = sum;
        for (int i = n; i > 0; i--) {
            if (!dp[i - 1][k]) {
                result.add(array[i - 1]);
                k -= array[i - 1];
            }
        }
        return result;
    }

    public static List<List<Integer>> findAllSubsets(int[] array, int sum) {
        List<List<Integer>> results = new ArrayList<>();
        findAll(array, sum, 0, new ArrayList<>(), results);
        return results;
    }

    private static void findAll(int[] array, int remaining, int index,
                                List<Integer> current, List<List<Integer>> results) {
        if (remaining == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        for (int i = index; i < array.length; i++) {
            if (array[i] <= remaining) {
                current.add(array[i]);
                findAll(array, remaining - array[i], i + 1, current, results);
                current.remove(current.size() - 1);
            }
        }
    }

    public static void main() {
        int[] input = {2, 3, 5};
        int  k  = 8;
        IO.println("a. True or False: "+ isSubsetSum(input, k));

        List<Integer> one = findOneSubset(input, k);
        System.out.println("b. One solution: " + (one != null ? one : "No solution"));

        List<List<Integer>> all = findAllSubsets(input, k);

        System.out.println("c. All solutions: " + (all.isEmpty() ? "No solution" : all));

    }
}
