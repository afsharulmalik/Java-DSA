package _22_Sets_And_Maps;

import java.util.HashMap;
import java.util.HashSet;

public class _03_LC1TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int i =0;
            for(int ele : nums){
                int rem = target - ele;
                if(map.containsKey(rem)) return new int[]{map.get(rem),i};
                map.put(ele,i);
                i++;
            }
            return new int[]{};
        }
    }
}
