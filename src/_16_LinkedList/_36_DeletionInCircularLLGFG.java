package _16_LinkedList;

public class _36_DeletionInCircularLLGFG {
//     Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

    class Solution {
        Node deleteNode(Node head, int key) {
            if (head == null) return null;
            // Single node
            if (head.next == head) {
                return (head.data == key) ? null : head;
            }
            Node curr = head;
            Node prev = null;
            // Delete Head
            if (head.data == key) {
                Node tail = head;
                while (tail.next != head) {
                    tail = tail.next;
                }
                head = head.next;
                tail.next = head;
                return head;
            }
            do {
                prev = curr;
                curr = curr.next;
                if (curr.data == key) {
                    prev.next = curr.next;
                    return head;
                }
            } while (curr != head);
            return head;
        }
    }

    public static void main(String[] args) {

    }
}
