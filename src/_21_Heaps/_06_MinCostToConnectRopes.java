package _21_Heaps;
import java.util.*;
public class _06_MinCostToConnectRopes {
    class Solution {
        public int minCost(int[] arr) {
            int cost = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int ele : arr){
                pq.add(ele);
            }
            while(pq.size()>1){
                int a1 = pq.remove();
                int a2 = pq.remove();
                int sum = a1 + a2;
                cost += sum;
                pq.add(sum);
            }
            return cost;
        }
    }
}
