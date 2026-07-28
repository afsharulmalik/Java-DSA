package _16_LinkedList;

public class _22_LC24SwapNodes {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }


    class Solution {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode prev = dummy;
            while (prev.next != null && prev.next.next != null) {
                ListNode first = prev.next;
                ListNode second = first.next;
                ListNode nextPair = second.next;
                // Swap
                prev.next = second;
                second.next = first;
                first.next = nextPair;
                // Move to next pair
                prev = first;
            }
            return dummy.next;
        }
    }
    public static void main(String[] args) {

    }
}
