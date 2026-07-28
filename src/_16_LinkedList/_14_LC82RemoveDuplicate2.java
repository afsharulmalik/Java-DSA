package _16_LinkedList;

public class _14_LC82RemoveDuplicate2 {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            ListNode i = head;
            while(i != null){
                if(i.next == null || i.val != i.next.val){
                    temp.next = i;
                    temp = i;
                    i = i.next;
                }else{
                    ListNode j = i.next;
                    while(j != null && j.val == i.val){
                        j = j.next;
                    }
                    i = j;
                }
            }
            temp.next = null;
            return dummy.next;
        }
    }

    // Nine approach
    class AlternateSolution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            ListNode curr = head;
            while (curr != null) {
                // Duplicate sequence detect hui
                if (curr.next != null && curr.val == curr.next.val) {
                    // Saare duplicate nodes skip karo
                    while (curr.next != null && curr.val == curr.next.val) {
                        curr = curr.next;
                    }
                    // Duplicate block ko remove karo
                    prev.next = curr.next;
                } else {
                    // Current node unique hai
                    prev = prev.next;
                }
                curr = curr.next;
            }
            return dummy.next;
        }
    }
    public static void main(String[] args) {

    }
}
