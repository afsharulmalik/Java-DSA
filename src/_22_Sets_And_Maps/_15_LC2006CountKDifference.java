package _22_Sets_And_Maps;

import java.util.HashMap;

public class _15_LC2006CountKDifference {
    class Solution {
        public int countKDifference(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int ele : nums) map.put(ele, map.getOrDefault(ele,0)+1);
            int ans = 0;
            for(int ele : nums) ans+= map.getOrDefault(ele+k,0);
            return ans;
        }
    }
}
