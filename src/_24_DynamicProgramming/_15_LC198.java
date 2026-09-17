package _24_DynamicProgramming;

public class _15_LC198 {
    class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            int[] dp = new int[3];
            dp[0] = nums[0];
            if(n==1) return nums[0];
            if(n > 1) dp[1]= Math.max(nums[0], nums[1]);
            if(n==2) return dp[1];
            for(int i=2; i<n; i++) {
                dp[2] = Math.max(nums[i]+dp[0],dp[1]); // pick and skip
                dp[0] = dp[1];
                dp[1] = dp[2];
            }
            return dp[2];
        }
    }
}
