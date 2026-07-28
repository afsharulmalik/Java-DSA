package _16_LinkedList;

public class _24_LC234PalindromeLL {
//    Find Middle
//      ↓
//    Reverse 2nd Half
//      ↓
//    Compare
//      ↓
//    Reverse Again
//      ↓
//    Join Back


//      Definition for singly-linked list.
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
            ListNode forward = head;
            while(curr != null){
                forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            return prev;
        }
        // start
        public boolean isPalindrome(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode head2 = slow.next;  // breaking condition
            slow.next = null;
            head2 = reverse(head2);

            // traversing and comparing
            ListNode i = head;
            ListNode j = head2;
            while(j!=null){
                if(i.val != j.val) return false;
                i = i.next;
                j = j.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {

    }
}
