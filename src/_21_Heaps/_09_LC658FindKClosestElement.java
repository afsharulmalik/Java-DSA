package _21_Heaps;
import java.util.*;

public class _09_LC658FindKClosestElement {

    class Element implements Comparable<Element>{
        int ele;
        int diff;
        Element(int ele, int diff){
            this.ele = ele;
            this.diff = diff;
        }
        public int compareTo(Element e){
            if(this.diff == e.diff){
                return this.ele - e.ele;
            }
            return this.diff - e.diff;
        }
    }
    class Solution {
        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            PriorityQueue<Element> pq = new PriorityQueue<>(Collections.reverseOrder());
            for(int num : arr){
                int diff = Math.abs(num - x);
                pq.add(new Element(num, diff));
                if(pq.size()>k) pq.remove();
            }
            List<Integer> ans = new ArrayList<>();
            while(!pq.isEmpty()) ans.add(pq.remove().ele);
            Collections.sort(ans);
            return ans;
        }
    }
}
