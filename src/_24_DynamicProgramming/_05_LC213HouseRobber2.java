package _24_DynamicProgramming;

import java.util.Arrays;

public class _05_LC213HouseRobber2 {
    class Solution {
        static int[] dp;
        private int helper(int i, int end, int[] nums) {
            if(i > end) return 0;
            if(dp[i] != -1) return dp[i];
            int pick = nums[i] + helper(i+2, end, nums);
            int skip = helper(i+1, end, nums);
            return dp[i] = Math.max(pick, skip);
        }
        public int rob(int[] nums) {
            int n = nums.length;
            if(n == 1) return nums[0]; // only one house

            dp = new int[n];
            Arrays.fill(dp, -1);
            int case1 = helper(0, n-2, nums); // 1st house included

            dp = new int[n];
            Arrays.fill(dp, -1);
            int case2 = helper(1, n-1, nums); // 1st not included
            return Math.max(case1,case2);
        }
    }
// 2 baar dp mein fill kr rhe h coz hum 2 baar different range ke liye solve kar rhe hai
}
