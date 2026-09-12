package _23_BitManipulation;

public class _14_LC190ReverseBits {
    public class Solution {
        public int reverseBits(int n) {
            int ans = 0;
            for (int i = 0; i < 32; i++) {
                int bit = n & 1;
                ans = (ans << 1) | bit;
                n = n >>> 1;
            }
            return ans;
        }
    }
}
