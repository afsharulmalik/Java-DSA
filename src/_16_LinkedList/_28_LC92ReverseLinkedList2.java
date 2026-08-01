package _16_LinkedList;

public class _28_LC92ReverseLinkedList2 {

//     * Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        // helper function
        public ListNode reverse(ListNode head){
            ListNode prev = null;
            ListNode curr = head;
            ListNode forward = null;
            while(curr != null){
                forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            return prev;
        }
        public ListNode reverseBetween(ListNode head, int left, int right) {
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            dummy.next = head;

            for(int i=1; i<left; i++){
                temp = temp.next;
            }

            ListNode tail1 = temp;
            ListNode head2 = temp.next;

            for(int i=1; i<=right-left+1; i++){
                temp = temp.next;
            }

            ListNode tail2 = temp;
            ListNode head3 = temp.next;

            tail1.next = null;
            tail2.next = null;

            ListNode revHead = reverse(head2);

            tail1.next = revHead;
            head2.next = head3;
            return dummy.next;
        }
    }
    public static void main(String[] args) {

    }
}
