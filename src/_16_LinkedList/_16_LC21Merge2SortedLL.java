package _16_LinkedList;

public class _16_LC21Merge2SortedLL {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            while(list1 != null && list2 != null){
                if(list1.val<=list2.val){
                    temp.next = list1;  // connect kar rha hai
                    list1 = list1.next;   // i++
                    temp = temp.next;
                }else{
                    temp.next = list2;
                    list2 = list2.next;  // i++
                    temp = temp.next;
                }
            }
            if(list1 != null){
                temp.next = list1;
            }else{
                temp.next = list2;
            }
            return dummy.next;
        }
    }
    public static void main(String[] args) {

    }
}
