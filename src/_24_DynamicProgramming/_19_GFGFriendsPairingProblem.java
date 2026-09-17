package _24_DynamicProgramming;

public class _19_GFGFriendsPairingProblem {
    class Solution {
        // Recursion
        public int countFriendsPairingsRecursion(int n) {
            if(n<=2) return n;
            return countFriendsPairingsRecursion(n-1) + (n-1)*countFriendsPairingsRecursion(n-2);
        }

        // Dynamic Programming Method
        public int helper (int n, int[] dp){
            if(n<=2) return n;
            if(dp[n] != 0) return dp[n];
            return dp[n] = helper(n-1,dp) + (n-1)*helper(n-2,dp);
        }
        public int countFriendsPairings(int n){
            int[] dp = new int[n+1]; // just to avoid 0th index
            return helper(n,dp);
        }

        // Iterative method
        public int countFriendsPairing(int n){
            int[] dp = new int[n+1];
            for(int i=1; i<=n; i++){
                if(i<=2) dp[i] =i;
                else dp[i] = dp[i-1] + (i-1)*dp[i-2];
            }
            return dp[n];
        }

        // Space Optimised Solution
        public int countFriendPairings(int n){
            int[] dp = new int[3];
            dp[0] = 1;
            dp[1] = 2;
            if(n<=2) return n+1;
            for(int i=3; i<=n; i++){
                dp[2] = dp[1] + (i-1)*dp[0];
                dp[0] = dp[1];
                dp[1] = dp[2];
            }
            return dp[1];
        }
    }

}
