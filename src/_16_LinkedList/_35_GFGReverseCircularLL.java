package _16_LinkedList;

public class _35_GFGReverseCircularLL {

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

    class Solution{
        // this method is directly reversing circular linked list
        public Node reverseCircularDirectly(Node head){
            if (head == null || head.next == head) {
                return head;
            }
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            Node prev = tail;
            Node curr = head;
            Node fwd = null;
            do{
                fwd = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fwd;
            }while(curr != head);
            return prev;
        }

        // This method mein circular ll ko single ll mein convert karke reverse kar rhe hai
        public void reverseList(Node head){
            Node prev = null;
            Node curr = head;
            Node fwd = null;
            while (curr != null){
                fwd = curr.next;
                curr.next = prev;
                prev = curr;
                curr = fwd;
            }
        }
        public Node reverseCircular(Node head) {
            Node tail = head;  // this section will convert circular ll into single ll
            while(tail.next != head) tail = tail.next;
            tail.next = null;
            reverseList(head);
            head.next = tail;
            return tail;
        }
    }

    public static void main(String[] args) {

    }
}
