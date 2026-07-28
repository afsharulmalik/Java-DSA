package _16_LinkedList;

public class _20_LC328OddEvenLL {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode oddEvenList(ListNode head) {
            ListNode d1 = new ListNode(-1);
            ListNode d2 = new ListNode(-1);
            ListNode t1 = d1; // even
            ListNode t2 = d2; // odd
            ListNode t = head;
            int pos = 1;
            while(t != null){
                if(pos%2 != 0){
                    t1.next = t;
                    t1 = t1.next;
                }else{
                    t2.next = t;
                    t2 = t2.next;
                }
                t = t.next;
                pos++;
            }
            t2.next = null;
            t1.next = d2.next;
            return d1.next;
        }
    }
    public static void main(String[] args) {

    }
}
