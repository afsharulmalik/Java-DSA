package _22_Sets_And_Maps;

import java.util.HashSet;

public class _02_GFGFindDistinctElements {
    class Solution {
        static int distinct(int arr[], int n) {
            HashSet<Integer> set = new HashSet<>();
            for(int ele : arr) set.add(ele);
            return set.size();
        }
    }
}
