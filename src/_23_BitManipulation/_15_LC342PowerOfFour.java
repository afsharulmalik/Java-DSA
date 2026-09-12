package _23_BitManipulation;

public class _15_LC342PowerOfFour {
    class Solution {
        public boolean isPowerOfFour(int n) {
            if(n<4) return false;
            while (n%4 == 0) n /= 4;
            return n==1;
        }
    }

    class AlternateSolution {
        // helper function
        public boolean isPowerOfTwo(int n){
            if(n==0) return false;
            if(n==Integer.MIN_VALUE) return false;
            return ((n & (n-1))==0);
        }
        boolean isSquare(int n){
            double root = (double)Math.sqrt(n);
            return (root * root == n);
        }
        // main function
        public boolean isPowerOfFour(int n) {
            return isPowerOfTwo(n) && isSquare(n);
        }
    }
}
