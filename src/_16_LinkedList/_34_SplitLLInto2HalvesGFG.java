package _16_LinkedList;
import kotlin.Pair;


public class _34_SplitLLInto2HalvesGFG {
//    Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


    class Solution {
        public Pair<Node, Node> splitList(Node head) {
            if(head == null) return new Pair<>(null, null);  // empty list
            if(head.next == head) return new Pair<>(head, null);  // single list
            Node slow = head;
            Node fast = head;
            while(fast.next != head && fast.next.next != head){  // middle
                slow = slow.next;
                fast = fast.next.next;
            }
            if(fast.next.next == head) fast = fast.next; // even no of nodes
            Node head1 = head;
            Node head2 = slow.next;
            slow.next = head;  // 1st half circular
            fast.next = head2; // 2nd half circular
            return new Pair<>(head1,head2);
        }
    }
    public static void main(String[] args) {

    }
}
