package _18_Queues;
import java.util.*;
public class _04_GFGReverse1stKOfQueue {
    class Solution {
        public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
            int n = q.size();
            if (k < 0 || k > n) {
                return q;
            }
            Stack<Integer> st = new Stack<>();
            for(int i=0; i<k; i++){
                st.add(q.remove());
            }
            while(!st.isEmpty()){
                q.add(st.pop());
            }
            for(int i=0; i<n-k; i++){
                q.add(q.remove());
            }
            return q;
        }
    }
}
