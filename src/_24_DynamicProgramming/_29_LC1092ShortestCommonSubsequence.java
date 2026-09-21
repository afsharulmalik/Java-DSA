package _24_DynamicProgramming;

public class _29_LC1092ShortestCommonSubsequence {
    class Solution {
        public String shortestCommonSupersequence(String a, String b) {
            int m = a.length();
            int n = b.length();
            //ye abhi lcs wala kaam hua hai yha par
            int[][] dp = new int[m+1][n+1];
            for(int i=1; i<=m; i++){
                for(int j=1; j<=n; j++){
                    if(a.charAt(i-1)==b.charAt(j-1)){
                        dp[i][j] = 1+dp[i-1][j-1];
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            // scs wala kaam yha hoga  yha backtrack ho rha hai lcs table mein
            StringBuilder ans = new StringBuilder();
            int i=m;
            int j=n;
            while(i>0 && j>0){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    ans.append(a.charAt(i-1));
                    i--;
                    j--;
                }else if(dp[i-1][j]>dp[i][j-1]){
                    ans.append(a.charAt(i-1));
                    i--;
                }else{
                    ans.append(b.charAt(j-1));
                    j--;
                }
            }
            while(i>0){
                ans.append(a.charAt(i-1));
                i--;
            }
            while(j>0){
                ans.append(b.charAt(j-1));
                j--;
            }
            return ans.reverse().toString();
        }
    }
}
