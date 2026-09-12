package _23_BitManipulation;

public class _12_LC2220MinimumBitFlips {
    class Solution {
        public int minBitFlips(int start, int goal) {
            // eg 1 : 1010 -> 0111 ans = 3 flips
            int xor = start ^ goal;
//            return Integer.bitCount(xor);

            // agar bitCount use nahi karna ho toh
            int count = 0;
            while(xor != 0){
                xor = xor & (xor -1);
                count++;
            }
            return count;
        }
    }
}
