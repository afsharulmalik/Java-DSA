package _24_DynamicProgramming;

public class _01_LC509FibonacciNumber {
    class Solution {
        static int[] dp;
        public int helper(int n){
            if(n<=1) return n; // base case
            if(dp[n] != 0) return dp[n]; // dp array mein check kar rhe hai value hai toh return kar denge
            int ans = helper(n-1) + helper(n-2); // storing the ans
            dp[n] = ans; // array mein store kar rhe hai
            return ans;
        }
        // main function
        public int fib(int n) {
            dp = new int[n+1]; // index 0 to n tak chaiye
            return helper(n);
        }
    }
// solved using dynamic programming TC = 0(2n) and SC = 0(n)
}
