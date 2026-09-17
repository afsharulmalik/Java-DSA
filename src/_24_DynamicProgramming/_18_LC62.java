package _24_DynamicProgramming;

public class _18_LC62 {
    class Solution {
        public int uniquePaths(int m, int n) {
            // Space Optimised tabulation method
            if(m==1 || n==1) return 1;
            int[][] dp = new int[2][n];
            // filling 0th row with 1
            for(int j=0; j<n; j++) dp[0][j] =1;
            dp[1][0] = 1; // 2nd element of 0th col
            for(int i=0; i<m-1; i++){
                // filling 1st col
                for(int j=1; j<n; j++){
                    dp[1][j] = dp[0][j] + dp[1][j-1];
                }
                // copying 1st row to 0th row
                for(int j =0; j<n; j++) dp[0][j] = dp[1][j];
            }
            return dp[1][n-1];
        }
    }
}
