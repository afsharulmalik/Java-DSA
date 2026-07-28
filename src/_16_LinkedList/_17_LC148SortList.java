package _16_LinkedList;

public class _17_LC148SortList {

    /*
    Merge Sort in Linked List ke 4 steps hamesha ye hote hain:

    Find Mid
    Break the list (slow.next = null)
    Sort left & right recursively
    Merge both sorted lists

    Ye pattern LeetCode 148 ka core concept hai.
     */

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
          // ye wala helper function hai
        public ListNode merge(ListNode head1, ListNode head2){
            ListNode i = head1;
            ListNode j = head2;
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            while(i != null && j != null){
                if(i.val <= j.val){
                    temp.next = i;
                    i = i.next;
                }else{
                    temp.next = j;
                    j = j.next;
                }
                temp = temp.next;
            }
            if(i == null) temp.next = j;
            else temp.next = i;
            return dummy.next;
        }

        // yha se question ka answer start hai
        public ListNode sortList(ListNode head) {
            if(head == null || head.next == null) return head;
            ListNode slow = head;
            ListNode fast = head;
            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode head2 = slow.next;  // break hone par new node
            slow.next = null;  // Imp
            head = sortList(head);
            head2 = sortList(head2);
            ListNode ans = merge(head, head2);
            return ans;
        }
    }
    public static void main(String[] args) {

    }
}
