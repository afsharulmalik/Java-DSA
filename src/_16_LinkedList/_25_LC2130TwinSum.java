package _16_LinkedList;

public class _25_LC2130TwinSum {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;
            while(curr != null){
                ListNode forward = curr.next;
                curr.next = prev;
                prev = curr;
                curr = forward;
            }
            return prev;
        }
        public int pairSum(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode second = reverse(slow);
            ListNode first = head;
            int max = 0;
            while (second != null) {
                max = Math.max(max, first.val + second.val);
                first = first.next;
                second = second.next;
            }
            return max;
        }
    }
    public static void main(String[] args) {

    }
}
