package _11_Recursion;

public class _15_Leetcode50 {
    class Solution {
        // ye helpwe function hai issey TLE nahi aayega

        public double power(double x, long n) {
            if (n==0) return 1;
            double call = power(x, n / 2);
            if (n % 2 == 0) return call * call;
            else return x * call * call;
        }
        public double myPow(double x, int n) {
            long N = n;
            if (N < 0) {
                x = 1 / x;
                N = -N;
            }
            return power(x, N);
        }
    }
}
