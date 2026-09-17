package _24_DynamicProgramming;

public class _14_LC509 {
    class Solution {
        public int fib(int n) {
            // Space Optimised Tabulation Method
            if(n<=1) return n;
            int[] dp = new int[3];
            dp[0] = 0; // ye nahi v likhenge tab v chalega coz already array mein 0 input hai
            dp[1] = 1;
            for(int i=2; i<=n; i++){
                dp[2] = dp[0] + dp[1];
                dp[0] = dp[1];
                dp[1] = dp[2];
            }
            return dp[2];
        }
    }
}
