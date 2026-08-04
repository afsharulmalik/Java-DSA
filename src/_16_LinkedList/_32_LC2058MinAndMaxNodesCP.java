package _16_LinkedList;
import java.util.*;

public class _32_LC2058MinAndMaxNodesCP {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public int[] nodesBetweenCriticalPoints(ListNode head) {
            // Raghav Sir Approach
            int[] ans = {-1,-1};
            int idx = 1;
            int firstIdx = -1;
            int lastIdx = -1;
            int minDist = Integer.MAX_VALUE;
            ListNode a = head;
            ListNode b = head.next;
            ListNode c = head.next.next;
            if(c == null) return ans;
            while(c != null){
                if((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)){
                    if(firstIdx == -1) firstIdx = idx;
                    if(lastIdx != -1){
                        int dist = idx - lastIdx;
                        minDist = Math.min(dist,minDist);
                    }
                    lastIdx = idx;
                }
                idx++;
                a = a.next;
                b = b.next;
                c = c.next;
            }
            int maxDist = lastIdx - firstIdx;
            if(maxDist == 0) maxDist = -1;
            if(minDist == Integer.MAX_VALUE) minDist = -1;
            ans[0] = minDist;
            ans[1] = maxDist;
            return ans;


            // this is yt par random video ka approach
            // isme extra space le rha hai isliye optimal solution nahi hai
//            ArrayList<Integer> ans = new ArrayList<>();
//            ListNode prev = null;
//            ListNode curr = head;
//            int[] res = {-1,-1};
//            int idx = 1;
//            while(curr.next != null){  // traverse
//                if(prev == null){
//                    prev = curr;
//                    curr = curr.next;
//                    idx++;
//                    continue;
//                }
//                if(curr.val>prev.val && curr.val>curr.next.val) ans.add(idx);  // local maxima
//                if(curr.val<prev.val && curr.val<curr.next.val) ans.add(idx);  // local minima
//                prev = curr;
//                curr = curr.next;
//                idx++;
//            }
//            if(ans.size()>=2){
//                int min = Integer.MAX_VALUE;
//                for(int i=1; i<ans.size(); i++){
//                    int dist=ans.get(i)-ans.get(i-1);
//                    if(dist<min)
//                        min=dist;
//                }
//                res[0]=min;
//                res[1]=ans.get(ans.size()-1)-ans.get(0);
//            }
//            return res;
        }
    }
    public static void main(String[] args) {

    }
}
