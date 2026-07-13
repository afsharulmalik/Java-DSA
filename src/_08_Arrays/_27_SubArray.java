package _08_Arrays;

public class _27_SubArray {
    class Solution {
        public int[] maxSubArrayWithIndices(int[] nums) {

            int currSum = nums[0];
            int maxSum = nums[0];

            int start = 0;
            int end = 0;
            int tempStart = 0;

            for (int i = 1; i < nums.length; i++) {

                if (nums[i] > currSum + nums[i]) {
                    currSum = nums[i];
                    tempStart = i;   // new subarray start
                } else {
                    currSum = currSum + nums[i];
                }

                if (currSum > maxSum) {
                    maxSum = currSum;
                    start = tempStart;
                    end = i;
                }
            }

            return new int[]{start, end};
        }
    }
}
