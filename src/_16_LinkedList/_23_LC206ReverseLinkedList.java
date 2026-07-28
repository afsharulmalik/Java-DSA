package _16_LinkedList;

public class _23_LC206ReverseLinkedList {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverseList(ListNode head) {
            // Recursive Way :
            if(head == null || head.next == null) return head;
            ListNode a = head.next;
            head.next = null;
            ListNode b = reverseList(a);
            a.next = head;
            return b;


            // 1st solution
            // ListNode prev = null;
            // ListNode curr = head;
            // ListNode forward = head;
            // while(curr != null){
            //     forward = curr.next;
            //     curr.next = prev;
            //     prev = curr;
            //     curr = forward;
            // }
            // return prev;
        }
    }
    public static void main(String[] args) {

    }
}
