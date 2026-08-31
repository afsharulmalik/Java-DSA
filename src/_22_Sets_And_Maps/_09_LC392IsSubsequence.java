package _22_Sets_And_Maps;

public class _09_LC392IsSubsequence {
    class Solution {
        public boolean isSubsequence(String s, String t) {
            int i = 0;
            int j = 0;
            while (i < s.length() && j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    i++;
                }
                j++;
            }
            return i == s.length();
        }
    }
}
