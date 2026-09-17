package _24_DynamicProgramming;

import java.util.Arrays;

public class _04_LC746MinCostClimbingStairs {
    class Solution {
        static int[] dp;
        private int helper(int i, int[] cost) {
            if (i >= cost.length)
                return 0;
            if (dp[i] != -1)
                return dp[i];
            return dp[i] = cost[i] + Math.min(helper(i+1, cost), helper(i+2, cost));
        }
        public int minCostClimbingStairs(int[] cost) {
            dp = new int[cost.length];
            Arrays.fill(dp, -1);
            return Math.min(helper(0, cost), helper(1, cost));
        }
    }
}
