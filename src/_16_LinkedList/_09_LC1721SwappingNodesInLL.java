package _16_LinkedList;

public class _09_LC1721SwappingNodesInLL {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public ListNode swapNodes(ListNode head, int k) {
            ListNode first = head;
            for (int i = 1; i < k; i++) {
                first = first.next;
            }
            ListNode temp = first;
            ListNode second = head;
            while (temp.next != null) {
                temp = temp.next;
                second = second.next;
            }
            int value = first.val;
            first.val = second.val;
            second.val = value;
            return head;
        }
    }
    public static void main(String[] args) {

    }
}
