package _21_Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class _05_LC1046LastStoneWeight {
    class Solution {
        public int lastStoneWeight(int[] stones) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int ele : stones){
                pq.add(ele);
            }
            while (pq.size()>1){
                int s1 = pq.remove();
                int s2 = pq.remove();
                if(s1 != s2) pq.add(s1-s2);
            }
            if(pq.isEmpty()) return 0;
            else return pq.peek();
        }
    }

    public static void main(String[] args) {

    }
}
