package _16_LinkedList;

public class _08_LC19RemoveNthFromEnd {


//      Definition for singly-linked list.   predefined rhta hai question mein
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }


      // Approach :- isme fast ko n+1 se aage karenge jab fast null ho jaaayega tab slow uss node par hoga jisko delete
    // karna hai...............tab slow.next = slow.next.next karenge aur dummy.next ko return kar denge

    // dummy node iss liye bnaye hai coz head ko move karenge toh hamara linked list kharab ho jaayega

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode slow = dummy;
            ListNode fast = dummy;
            for(int i=1; i<=n+1; i++){
                fast = fast.next;
            }
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return dummy.next;

            // alternate solution
            // ListNode fast = head;
            //     ListNode slow = head;
            //     for(int i=1; i<=n; i++){
            //         fast = fast.next;
            //     }
            //     if(fast == null) return head.next;
            //     while(fast.next != null){
            //         slow = slow.next;
            //         fast = fast.next;
            //     }
            //     // delete hoga isssey
            //     slow.next = slow.next.next;
            //     return head;
        }
    }
    public static void main(String[] args) {

    }
}
