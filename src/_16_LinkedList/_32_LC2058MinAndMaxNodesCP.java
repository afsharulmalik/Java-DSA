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
            ArrayList<Integer> ans = new ArrayList<>();
            ListNode prev = null;
            ListNode curr = head;
            int[] res = {-1,-1};
            int idx = 1;
            while(curr.next != null){  // traverse
                if(prev == null){
                    prev = curr;
                    curr = curr.next;
                    idx++;
                    continue;
                }
                if(curr.val>prev.val && curr.val>curr.next.val) ans.add(idx);  // local maxima
                if(curr.val<prev.val && curr.val<curr.next.val) ans.add(idx);  // local minima
                prev = curr;
                curr = curr.next;
                idx++;
            }
            if(ans.size()>=2){
                int min = Integer.MAX_VALUE;
                for(int i=1; i<ans.size(); i++){
                    int dist=ans.get(i)-ans.get(i-1);
                    if(dist<min)
                        min=dist;
                }
                res[0]=min;
                res[1]=ans.get(ans.size()-1)-ans.get(0);
            }
            return res;
        }
    }
    public static void main(String[] args) {

    }
}
