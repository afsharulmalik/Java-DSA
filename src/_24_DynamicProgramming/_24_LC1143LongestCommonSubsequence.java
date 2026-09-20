package _24_DynamicProgramming;

public class _24_LC1143LongestCommonSubsequence {
    class Solution {
        private int helper(int i, int j, String a, String b) {
            if(i<0 || j<0) return 0;
            if(a.charAt(i)==b.charAt(j)) return 1 + helper(i-1, j-1, a, b);
            else return Math.max(helper(i-1,j,a,b),helper(i,j-1,a,b));
        }
        public int longestCommonSubsequence(String a, String b) {
            int m = a.length();
            int n = b.length();
            return helper(m-1,n-1,a,b);
        }
    }


    // dp ka solution hai
    // m-1 to 0 and n-1 to 0
//    private int helper(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
//        if(i<0 || j<0) return 0;
//        if(dp[i][j] != -1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + helper(i-1, j-1, a, b, dp);
//        else return dp[i][j] = Math.max(helper(i-1,j,a,b, dp),helper(i,j-1,a,b, dp));
//    }
//    public int longestCommonSubsequence(String a, String b){
//        // isme string builder use karenge coz string pass by value hota hai aur without string builder
//        // karenge toh memory limit exceeded ka error de dega
//        int m = a.length();
//        int n = b.length();
//        int[][] dp = new int[m][n];
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                dp[i][j] = -1; // this means dp is marked as unvisited
//            }
//        }
//        return helper(m-1, n-1, new StringBuilder(a), new StringBuilder(b), dp);
//    }



    // dp ka tabulation method
    public int LongestCommonSubsequence(String a, String b){
        // isme string builder use karenge coz string pass by value hota hai aur without string builder
        // karenge toh memory limit exceeded ka error de dega
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // these ternary operator are used to prevent index out of bond error
                // this can be avoided if we use the dp of index m+1 and n+1
                int x = (i-1>=0 && j-1>=0) ? dp[i-1][j-1] : 0;
                int y = (i-1>=0) ? dp[i-1][j] : 0;
                int z = (j-1>=0) ? dp[i][j-1] : 0;
                if(a.charAt(i)==b.charAt(j)) dp[i][j] = 1 + x;
                else dp[i][j] = Math.max(y,z);
            }
        }
        return dp[m-1][n-1];
    }



    // dp ka tabulation method Optimal method
    public int longestCommonSubsequence(String a, String b){
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(a.charAt(i)==b.charAt(j)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
}
