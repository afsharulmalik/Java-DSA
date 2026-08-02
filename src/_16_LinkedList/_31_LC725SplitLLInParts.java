package _16_LinkedList;

public class _31_LC725SplitLLInParts {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode[] splitListToParts(ListNode head, int k) {
            // find length
            ListNode curr = head;
            int length = 0;
            while(curr != null){
                length++;
                curr = curr.next;
            }

            //base size
            int partSize = length / k;
            int extra = length % k;

            // result array
            ListNode[] ans = new ListNode[k];
            curr = head;
            for(int i=0; i<k; i++){
                if(curr == null){
                    ans[i] = null;
                    continue;
                }
                ans[i] = curr;
                int currPartSize = partSize;
                if(extra>0){
                    currPartSize++;
                    extra--;
                }

                for(int j=1; j<currPartSize; j++){
                    curr = curr.next;
                }
                ListNode forward = curr.next;
                curr.next = null;  // cut karega
                curr = forward;
            }
            return ans;
        }
    }
    public static void main(String[] args) {

    }
}
