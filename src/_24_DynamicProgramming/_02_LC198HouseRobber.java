package _24_DynamicProgramming;

import java.util.Arrays;

public class _02_LC198HouseRobber {
    class Solution {
        // helper function
        static int dp[];
        private int loot(int i, int[] nums) {
            if(i >= nums.length) return 0;
            if(dp[i] != -1) return dp[i];
            int pick = nums[i] + loot(i+=2, nums);
            int skip = loot(i++, nums);
            int ans = Math.max(pick, skip);
            dp[i] = ans;
            return ans;
        }
        public int rob(int[] nums) {
            dp = new int[nums.length]; // 0 to n-1
            Arrays.fill(dp, -1); // mark
            return loot(0, nums);
        }
    }
}
