package _22_Sets_And_Maps;
import java.util.*;
public class _08_LC1207UniqueNoOfOccurences {
    class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            HashMap<Integer, Integer> map = new HashMap<>();
            // frequency count
            for (int ele : arr){
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
            // check duplicate frequencies
            HashSet<Integer> set = new HashSet<>();
            for (int freq : map.values()){
                if (set.contains(freq)){
                    return false;
                }
                set.add(freq);
            }
            return true;
        }
    }
}
