package Lab4;

public class Question1 {
    public static boolean isSubsetSum(int[] array, int sum) {
        int n = array.length;
        boolean[][] dp = new boolean[n+1][sum + 1];
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

    public static void main() {
        int[] input = new int[]{2, 3, 5};
        isSubsetSum(input, 8);
    }
}
