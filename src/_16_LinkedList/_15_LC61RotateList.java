package _16_LinkedList;

public class _15_LC61RotateList {

//      Definition for singly-linked list.
     public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


    class Solution {
        public int length(ListNode head) {
            int len = 0;
            ListNode temp = head;

            while (temp != null) {
                len++;
                temp = temp.next;
            }
            return len;
        }
        public ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) return head;
            int n = length(head);
            k %= n;
            if (k == 0) return head;
            ListNode slow = head;
            ListNode fast = head;
            // fast ko k steps aage le jao
            for (int i = 0; i < k; i++) {
                fast = fast.next;
            }
            // fast ko last node tak le jao
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            ListNode newHead = slow.next;
            slow.next = null;
            fast.next = head;
            return newHead;
        }
    }
    public static void main(String[] args) {

    }
}
