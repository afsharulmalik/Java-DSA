package _24_DynamicProgramming;

import java.util.Arrays;

public class _30_LC300LongestIncreasingSubsequence {
    class Solution {
        private int helper(int idx, int prev, int[] nums) {
            if(idx == nums.length) return 0;
            int skip = helper(idx+1, prev, nums);
            if(prev!=-1 && nums[idx]<=nums[prev]) return skip;
            int pick = 1+helper(idx+1, idx, nums);
            return Math.max(pick,skip);
        }
        // main function
        public int lengthOfLIS(int[] nums) {
            int n = nums.length;
            int[][] dp = new int[n][n+1];
            return helper(0,-1, nums);
        }
    }

    // andhadhun dp
//    private int helper(int idx, int prev, int[] nums, int[][] dp) {
//        if(idx == nums.length) return 0;
//        if(dp[idx][prev+1] != -1) return dp[idx][prev+1];
//        int skip = helper(idx+1, prev, nums, dp);
//        if(prev!=-1 && nums[idx]<=nums[prev]) return dp[idx][prev+1] = skip;
//        int pick = 1+helper(idx+1, idx, nums, dp);
//        return dp[idx][prev+1] = Math.max(pick,skip);
//    }
//    // main function
//    public int lengthOfLIS(int[] nums) {
//        int n = nums.length;
//        int[][] dp = new int[n][n+1];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<=n; j++){
//                dp[i][j] = -1;
//            }
//        }
//        return helper(0,-1, nums,dp);
//    }


    // Tabulation method
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int maxLen = 0;
        for(int i=0; i<n; i++){
            int max = 0;
            for(int j=0; j<i; j++){
                if(nums[j]<nums[i]){
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i]+=max;
            maxLen = Math.max(maxLen,dp[i]);
        }
        return maxLen;
    }
}
