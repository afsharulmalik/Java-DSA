package _16_LinkedList;

public class _27_LC23MergeKSortedLists {


//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        // helper function for approach 2nd
        private ListNode merge(ListNode l1, ListNode l2){
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            while(l1 != null && l2 != null){
                if(l1.val<=l2.val){
                    temp.next = l1;
                    l1 = l1.next;
                }else{
                    temp.next = l2;
                    l2 = l2.next;
                }
                temp = temp.next;
            }
            if(l1 != null){
                temp.next = l1;
            }else{
                temp.next = l2;
            }
            return dummy.next;
        }
        // helper function for approach 2nd
        public ListNode divide(ListNode[] lists, int left, int right){  // this will divide lists
            if(left == right) return lists[left];
            int mid = left + (right - left)/2;
            ListNode l1 = divide(lists, left, mid);
            ListNode l2 = divide(lists, mid+1, right);
            return merge(l1, l2);
        }
        public ListNode mergeKLists(ListNode[] lists) {
            // STARTING OF 2ND APPROACH
            // 2nd approach : Optimal (Using merge sort concept)
            if(lists == null || lists.length == 0) return null; // empty list
            return divide(lists, 0, lists.length-1);

            // helper function approach 1
            // public ListNode merge(ListNode l1, ListNode l2){
            //     ListNode dummy = new ListNode(-1);
            //     ListNode temp = dummy;
            //     while(l1 != null && l2 != null){
            //         if(l1.val<=l2.val){
            //             temp.next = l1;
            //             l1 = l1.next;
            //         }else{
            //             temp.next = l2;
            //             l2 = l2.next;
            //         }
            //         temp = temp.next;
            //     }
            //     if(l1 != null){
            //         temp.next = l1;
            //     }else{
            //         temp.next = l2;
            //     }
            //     return dummy.next;
            // }

            // 1st Approach : Brute Force
            // if(lists == null || lists.length == 0) return null;
            // ListNode ans = lists[0];
            // for(int i=1; i< lists.length; i++){
            //     ans = merge(ans, lists[i]);
            // }
            // return ans;
        }
    }
    public static void main(String[] args) {

    }
}
