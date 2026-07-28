package _16_LinkedList;

public class _21_SegregateEvenAndOddGFG {
//     Structure of a Linked List Node
class Node {
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

    class Solution {
        Node divide(Node head) {
            Node d1 = new Node(-1);
            Node d2 = new Node(-1);
            Node t1 = d1; // even
            Node t2 = d2; // odd
            Node t = head;
            while(t != null){
                if(t.data%2 == 0){
                    t1.next = t;
                    t1 = t1.next;
                }else{
                    t2.next = t;
                    t2 = t2.next;
                }
                t = t.next;
            }
            t2.next = null;
            t1.next = d2.next;
            return d1.next;
        }
    }
    public static void main(String[] args) {

    }
}
