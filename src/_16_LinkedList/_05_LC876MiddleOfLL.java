package _16_LinkedList;

public class _05_LC876MiddleOfLL {


        // Important concept hai ye
//    fast != null → Even length ko safely handle karta hai.
//            fast.next != null → Odd length ko safely handle karta hai.


//     Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    // slow fast approach :- isko tortoise and hare algorithm v bolte hai

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    }
    public static void main(String[] args) {

    }
}
