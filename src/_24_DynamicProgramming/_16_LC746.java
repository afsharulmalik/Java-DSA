package _24_DynamicProgramming;

public class _16_LC746 {
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int[] dp = new int[3];
            if(n==1) return cost[0];
            if(n==2) return Math.min(cost[0],cost[1]);
            dp[0] = cost[0];
            dp[1] = cost[1];
            for(int i=2; i<n; i++) {
                dp[2] = cost[i] + Math.min(dp[1], dp[0]);
                dp[0] = dp[1];
                dp[1] = dp[2];
            }
            return Math.min(dp[1], dp[0]);
        }
    }
}
