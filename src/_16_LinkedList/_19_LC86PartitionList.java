package _16_LinkedList;

public class _19_LC86PartitionList {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode d1 = new ListNode(-1);
            ListNode d2 = new ListNode(-1);
            ListNode t1 = d1;  // smaller than x
            ListNode t2 = d2;  // greater or equal
            ListNode t = head;
            while(t != null){
                if(t.val < x){
                    t1.next = t;
                    t1 = t1.next;
                }else{
                    t2.next = t;
                    t2 = t2.next;
                }
                t = t.next;
            }
            t1.next = d2.next;
            t2.next = null;
            return d1.next;
        }
    }
    public static void main(String[] args) {

    }
}
