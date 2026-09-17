package _24_DynamicProgramming;

public class _03_LC70ClimbingStairs {
    class Solution {
        static int[] dp;
        public int helper(int n){
            if(n<=1) return 1; // base case
            if(dp[n] != 0) return dp[n]; // dp array mein check kar rhe hai value hai toh return kar denge
            int ans = helper(n-1) + helper(n-2); // storing the ans
            dp[n] = ans; // array mein store kar rhe hai
            return ans;
        }
        public int climbStairs(int n) {
            dp = new int[n+1];
            return helper(n);
        }
    }
}
