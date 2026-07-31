package _16_LinkedList;

public class _26_LC143ReorderList {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverse(ListNode head){  // Reverse Function
            ListNode prev = null;
            ListNode curr = head;
            // ListNode forward = head.next;
            while(curr != null){
                ListNode forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            return prev;
        }
        public void reorderList(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;
            while(fast != null && fast.next != null){ // middle
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode second = slow.next;  // split
            slow.next = null;
            second = reverse(second);  // reverse
            ListNode first = head;
            while(second != null){  // Merge
                ListNode temp1 = first.next;
                ListNode temp2 = second.next;
                first.next = second;
                second.next = temp1;
                first = temp1;
                second = temp2;
            }
        }
    }
    public static void main(String[] args) {

    }
}
