package _17_Stacks;

public class _07_LC2487RemoveNodesFromLL {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverse(ListNode head){
            ListNode fwd = null;
            ListNode curr = head;
            ListNode prev = null;
            while(curr != null){
                fwd = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fwd;
            }
            return prev;
        }
        public ListNode removeNodes(ListNode head) {
            head = reverse(head);  // reverse function
            ListNode prev = head;
            ListNode curr = head.next;
            int max = head.val;
            while(curr != null){
                if(curr.val < max){
                    prev.next = curr.next;
                    curr = prev.next;
                }else{
                    max = curr.val;
                    prev = curr;
                    curr = curr.next;
                }
            }
            return reverse(head);
        }
    }
}
