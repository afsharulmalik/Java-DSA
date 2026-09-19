package _24_DynamicProgramming;

public class _28_LC72EditDistance {
    // Recursive solution
    class Solution {
        private int helper(int i, int j, StringBuilder a, StringBuilder b) {
            if(i<0) return j+1; // inserting remaining character of b
            if(j<0) return i+1; // deleting extra character of a
            if(a.charAt(i)==b.charAt(j)) return helper(i-1, j-1, a, b);
            int replace = 1 + helper(i-1, j-1, a, b);
            int remove = 1+ helper(i-1, j, a, b);
            int insert = 1+helper(i, j-1, a, b);
            return Math.min(remove,Math.min(replace, insert));
        }
        // main function
        public int minDistance(String a, String b) {
            int m = a.length();
            int n = b.length();
            return helper(m-1,n-1,new StringBuilder(a),new StringBuilder(b));
        }
    }

    // dp wala solution
//    private int helper(int i, int j, StringBuilder a, StringBuilder b,int[][] dp) {
//        if(i<0) return j+1; // inserting remaining character of b
//        if(j<0) return i+1; // deleting extra character of a
//        if(dp[i][j] != -1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = helper(i-1, j-1, a, b,dp);
//        int replace = 1 + helper(i-1, j-1, a, b,dp);
//        int remove = 1+ helper(i-1, j, a, b,dp);
//        int insert = 1+helper(i, j-1, a, b,dp);
//        return dp[i][j] = Math.min(remove,Math.min(replace, insert));
//    }
//    // main function
//    public int minDistance(String a, String b) {
//        int m = a.length();
//        int n = b.length();
//        int[][] dp = new int[m][n];
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                dp[i][j] = -1;
//            }
//        }
//        return helper(m-1,n-1,new StringBuilder(a),new StringBuilder(b),dp);
//    }


    // tabulation wala dp
    public int minDistance(String a, String b) {
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                // First row
                if(i == 0) {
                    dp[i][j] = j;
                }
                // First column
                else if(j == 0) {
                    dp[i][j] = i;
                }
                else if(a.charAt(i - 1) == b.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else {
                    int replace = 1 + dp[i - 1][j - 1];
                    int remove = 1 + dp[i - 1][j];
                    int insert = 1 + dp[i][j - 1];
                    dp[i][j] = Math.min(replace,Math.min(remove, insert));
                }
            }
        }
        return dp[m][n];
    }
}
