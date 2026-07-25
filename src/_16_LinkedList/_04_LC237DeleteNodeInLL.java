package _16_LinkedList;

import java.util.*;

public class _04_LC237DeleteNodeInLL {

//     * Definition for singly-linked list.

    // this is comments
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

     // this is solution
    class Solution {
        public void deleteNode(ListNode node) {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    public static void main(String[] args) {

    }
}
