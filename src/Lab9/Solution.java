package Lab9;

public class Solution {
    static int maxLoot(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        if (n == 0)
            return 0;
        if (n == 1)
            return nums[0];

        // Set previous 2 values
        int thirdLast = 0, secondLast = 0, last = nums[0];

        // Compute current value using previous
        // two values. The final current value
        // would be our result
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(Math.max(nums[i] + thirdLast, last), secondLast);
            thirdLast = secondLast;
            secondLast = last;
            last = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 5, 4, 3, 10, 5, 12};
        System.out.println(maxLoot(nums));
    }
}