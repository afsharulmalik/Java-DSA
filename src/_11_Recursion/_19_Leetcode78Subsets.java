package _11_Recursion;

import java.util.ArrayList;
import java.util.List;

public class _19_Leetcode78Subsets {
    class Solution {

        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> current = new ArrayList<>();
            helper(nums, 0, current, result);
            return result;
        }

        private void helper(int[] nums, int idx,
                            List<Integer> current,
                            List<List<Integer>> result) {
            // Base Case
            if (idx == nums.length) {
                result.add(new ArrayList<>(current));
                return;
            }
            current.add(nums[idx]);     // Include current element
            helper(nums, idx + 1, current, result);
            current.remove(current.size() - 1);  // Backtrack
            helper(nums, idx + 1, current, result);   // Exclude current element
        }
    }
    public static void main(String[] args) {

    }
}
