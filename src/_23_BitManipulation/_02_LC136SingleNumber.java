package _23_BitManipulation;

public class _02_LC136SingleNumber {
    class Solution {
        public int singleNumber(int[] nums) {
            int xor = 0;
            for(int ele : nums) xor = xor ^ ele;
            return xor;
        }
    }
}
