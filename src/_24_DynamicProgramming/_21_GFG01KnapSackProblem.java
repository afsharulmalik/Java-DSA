package _24_DynamicProgramming;

public class _21_GFG01KnapSackProblem {
//    class RecursiveSolution {
//        private int helper(int idx, int capacity, int[] val, int[] wt) {
//            if (idx == val.length){
//                if (capacity >= 0) return 0;
//                else return Integer.MIN_VALUE;
//            }
//            int pick = val[idx] + helper(idx+1, capacity-wt[idx],val,wt);
//            int skip = helper(idx+1,capacity,val,wt);
//            return Math.max(pick,skip);
//        }
//        public int knapsack(int capacity, int val[], int wt[]) {
//            return helper(0,capacity,val,wt);
//        }
//    }

    // DP
//    class AbdulBariSolution {
//        public int knapsack(int capacity, int val[], int wt[]) {
//            int n = wt.length;
//            int[][] dp = new int[n + 1][capacity + 1];
//            for(int i = 1; i <= n; i++) {
//                for(int j = 1; j <= capacity; j++) {
//                    // Item doesn't fit -> skip
//                    if(wt[i - 1] > j) {
//                        dp[i][j] = dp[i - 1][j];
//                    }
//                    // Item fits -> pick or skip
//                    else {
//                        dp[i][j] = Math.max(dp[i - 1][j],val[i - 1] + dp[i - 1][j - wt[i - 1]]);
//                }
//            }
//            return dp[n][capacity];
//        }
//    }

    // Raghav Garg
    class Solution {
        static int helper(int idx, int capacity, int[] val, int[] wt, int[][] dp) {
            if (idx == val.length)
                return 0;
            if (dp[idx][capacity] != 0)
                return dp[idx][capacity];
            int skip = helper(idx + 1, capacity, val, wt, dp);
            if (capacity < wt[idx])
                return dp[idx][capacity] = skip;
            int pick = val[idx] + helper(idx + 1, capacity - wt[idx], val, wt, dp);
            return dp[idx][capacity] = Math.max(pick, skip);
        }

        public int knapsack(int capacity, int[] val, int[] wt) {
            int n = val.length;
            int[][] dp = new int[n][capacity + 1];
            return helper(0, capacity, val, wt, dp);
        }
    }
}
