package _22_Sets_And_Maps;

import java.util.HashSet;

public class _07_LC217ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int ele : nums) set.add(ele);
            int n = nums.length;
            if(n==set.size()) return false;
            return true;
        }
    }

    // Another approach
    class Solution2{
        public boolean containsDuplicate(int[] nums){
            HashSet<Integer> set = new HashSet<>();
            for(int ele : nums) {
                if (!set.add(ele)) return true;
            }
            return false;
        }
    }
}
