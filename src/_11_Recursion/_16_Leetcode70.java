package _11_Recursion;

public class _16_Leetcode70 {
    class Solution {
        public int climbStairs(int n) {
            if(n<=2) return n;
            else return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}
