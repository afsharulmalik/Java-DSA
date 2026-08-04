package _16_LinkedList;

public class _39_GFGReverseDLL {
//     Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
    class Solution {
        public Node reverse(Node head) {

            // 2nd approach : using only 2 pointer
            Node temp = null;
            Node curr = head;
            while(curr != null){
                temp = curr.prev;
                curr.prev = curr.next;
                curr.next = temp;
                curr = curr.prev;  // aaage jaa rhe hai
            }
            return temp.prev;

            // 1st Approach : this is same as reversing single linked list
//            Node prev = null;
//            Node curr = head;
//            Node fwd = null;
//            while(curr != null){
//                fwd = curr.next;
//                curr.next = prev;
//                curr.prev = fwd;
//                prev = curr;
//                curr = fwd;
//            }
//            return prev;
        }
    }
    public static void main(String[] args) {

    }
}
