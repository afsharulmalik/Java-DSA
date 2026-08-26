package _21_Heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class _10_LC347TopKFrequentElements {
    static class Frequent implements Comparable<Frequent>{
        int frequency;
        int ele;
        Frequent(int frequency, int ele){
            this.frequency = frequency;
            this.ele = ele;
        }
        public int compareTo(Frequent f){
            if(this.frequency == f.frequency) return this.ele - f.ele;
            return this.frequency - f.frequency;
        }
    }
    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int num : nums) map.put(num,map.getOrDefault(num,0)+1);
            PriorityQueue<Frequent> pq = new PriorityQueue<>(); // min heap
            for(int num : map.keySet()){
                int freq = map.get(num);
                pq.add(new Frequent(freq,num));
                if(pq.size()>k) pq.remove();
            }
            int[] ans = new int[k];
            int idx = 0;
            while (!pq.isEmpty()){
                ans[idx++] = pq.remove().ele;
            }
            return ans;
        }
    }
}
