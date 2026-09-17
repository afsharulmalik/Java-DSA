package _24_DynamicProgramming;

public class _10_LC62UniquePaths {
    class Solution {
        int[][] dp;
        private int helper(int m, int n) {
            if(m == 1 || n == 1) return 1;
            if(dp[m][n] != 0) return dp[m][n];
            return dp[m][n] = helper(m, n-1) + helper(m-1, n);
        }
        public int uniquePaths(int m, int n) {
            dp = new int[m+1][n+1]; // row 0 to m tak and col 0 to n tak
            return helper(m, n);
        }
    }

    // Tabulation Method
    class Tabulation {
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
            for(int i =0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(i ==0 || j==0) dp[i][j] = 1;
                    else dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            return dp[m-1][n-1];
        }
    }
}
