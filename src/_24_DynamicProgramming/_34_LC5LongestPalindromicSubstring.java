package _24_DynamicProgramming;

public class _34_LC5LongestPalindromicSubstring {
            /*
            Odd palindrome:
            "aba"
              ↑
            single center

            Even palindrome:
            "abba"
               ↑
            two characters ke beech center


            expand(i, i)       // odd
            expand(i, i + 1)   // even
             */

    class Solution {
        public String longestPalindrome(String s) {
            int n = s.length();
            boolean[][] dp = new boolean[n][n];
            int start = 0;
            int maxLen = 1;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = i; j < n; j++) {
                    if (s.charAt(i) == s.charAt(j) &&
                            (j - i <= 2 || dp[i + 1][j - 1])) {
                        dp[i][j] = true;
                        if (j - i + 1 > maxLen) {
                            maxLen = j - i + 1;
                            start = i;
                        }
                    }
                }
            }
            return s.substring(start, start + maxLen);
        }
    }

//        **Time:** `O(n²)`
//            **Space:** `O(n²)`



}
