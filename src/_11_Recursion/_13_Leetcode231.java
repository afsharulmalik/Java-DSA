package _11_Recursion;

public class _13_Leetcode231 {
    // solution hai ye
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if(n==1) return true;
            if(n<=0 || n%2!=0) return false;
            else return isPowerOfTwo(n/2);
        }
    }
}
