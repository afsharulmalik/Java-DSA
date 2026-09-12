package _23_BitManipulation;

public class _05_LC231PowerOfTwo {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            int result = n & (n - 1);
            if (result == 0) return true;
            return false;
        }
    }
}

// alternate solution
class Solution2 {
    public boolean isPowerOfTwo(int n){
        if(n==1) return true;
        if(n==0) return false;
        if(n%2==1) return false;
        return isPowerOfTwo(n/2);
    }
}

class Solution3 {
    public boolean isPowerOfTwo(int n){
        if(n==0) return false;
        if(n==Integer.MIN_VALUE) return false;
        return ((n & (n-1))==0);
    }
}
