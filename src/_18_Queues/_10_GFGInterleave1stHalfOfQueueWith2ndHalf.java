package _18_Queues;
import java.util.*;
public class _10_GFGInterleave1stHalfOfQueueWith2ndHalf {
    class Solution {
        public void rearrangeQueue(Queue<Integer> q) {
            // challenge using stack : ye khud se kar rha hu bss
            Stack<Integer> st = new Stack<>();
            int n = q.size();
            for(int i=0; i<n/2; i++){
                st.push(q.remove());
            }
            while (!st.isEmpty()){
                q.add(st.pop());
            }
            for(int i=0; i<n/2; i++){
                st.push(q.remove());
            }
            while(!st.isEmpty()){
                q.add(st.pop()); // stack se q mein
                q.add(q.remove()); // q se q mein
            }
            // reversing k liye
            for(int i=0; i<n; i++){
                st.push(q.remove());
            }
            while(!st.isEmpty()){
                q.add(st.pop());
            }






            // using extra queue data structure : easy solution for interview
//            Queue<Integer> q2 = new LinkedList<>();
//            int n = q.size();
//            for(int i=0; i<n/2; i++){
//                q2.add(q.remove());
//            }
//            while(!q2.isEmpty()){
//                q.add(q2.remove());
//                q.add(q.remove());
//            }
        }
    }

    public static void main(String[] args) {

    }
}
