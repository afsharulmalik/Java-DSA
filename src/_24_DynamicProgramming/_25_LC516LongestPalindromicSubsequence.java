package _24_DynamicProgramming;

public class _25_LC516LongestPalindromicSubsequence {
    class Solution {
        private int helper(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
            if(i<0 || j<0) return 0;
            if(dp[i][j] != -1) return dp[i][j];
            if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + helper(i-1, j-1, a, b, dp);
            else return dp[i][j] = Math.max(helper(i-1,j,a,b, dp),helper(i,j-1,a,b, dp));
        }
        public int longestCommonSubsequence(StringBuilder a, StringBuilder b){
            // isme string builder use karenge coz string pass by value hota hai aur without string builder
            // karenge toh memory limit exceeded ka error de dega
            int m = a.length();
            int n = b.length();
            int[][] dp = new int[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    dp[i][j] = -1; // this means dp is marked as unvisited
                }
            }
            return helper(m-1, n-1, new StringBuilder(a), new StringBuilder(b), dp);
        }
        // main function
        public int longestPalindromeSubseq(String s) {
            StringBuilder a = new StringBuilder(s);
            StringBuilder b = new StringBuilder(s);
            b.reverse();
            return longestCommonSubsequence(a,b);
        }
    }
}
