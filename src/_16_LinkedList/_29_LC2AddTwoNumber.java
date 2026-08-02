package _16_LinkedList;

public class _29_LC2AddTwoNumber {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode t1 = l1;
            ListNode t2 = l2;
            int carry = 0;
            ListNode dummy = new ListNode(-1);
            ListNode tail = dummy;
            while(t1 != null || t2 != null){  // add operation
                int x = (t1 != null) ? t1.val : 0;
                int y = (t2 != null) ? t2.val : 0;
                int sum = x + y + carry;
                carry = sum / 10;
                int digit = sum % 10;
                tail.next = new ListNode(digit);
                tail = tail.next;
                if(t1 != null) t1 = t1.next;
                if(t2 != null) t2 = t2.next;
            }
            if(carry != 0){
                tail.next = new ListNode(carry);
            }
            return dummy.next;
        }
    }
    public static void main(String[] args) {

    }
}
