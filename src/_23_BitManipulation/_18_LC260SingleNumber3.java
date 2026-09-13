package _23_BitManipulation;

public class _18_LC260SingleNumber3 {
    class Solution {
        public int[] singleNumber(int[] nums) {
            int xor = 0;
            for(int num : nums) xor ^= num;
            int mask = (xor&(xor-1))^xor; // rightmost set bit mask
            int b1 =0;
            int b2 =0;
            for(int num : nums){
                if((num&mask)!=0) b1 ^= num;
                else b2 ^= num;
            }
            int[] ans = {b1, b2};
            return ans;
        }
    }
}
