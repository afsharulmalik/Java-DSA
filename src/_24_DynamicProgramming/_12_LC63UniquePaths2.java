package _24_DynamicProgramming;

public class _12_LC63UniquePaths2 {
    class Solution {
    // Current cell tak paths = top se paths + left se paths, aur agar current cell obstacle hai → 0.
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] dp = new int[m][n];
            for(int i =0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(obstacleGrid[i][j] == 1) dp[i][j] = 0;
                    else if(i==0 && j==0) dp[i][j] = 1; // starting cell
                    else if(i==0) dp[i][j] = dp[i][j-1]; // 1st row
                    else if(j==0) dp[i][j] = dp[i-1][j]; // 1st col
                    else dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
            return dp[m-1][n-1];
        }
    }
}
