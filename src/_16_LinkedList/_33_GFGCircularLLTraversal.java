package _16_LinkedList;

public class _33_GFGCircularLLTraversal {
//     Structure of circular linked list node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

    class Solution {
        public void printList(Node head) {
            //1st Approach
            // System.out.print(head.data+" ");
            // Node temp = head.next;
            // while(temp != head){
            //     System.out.print(temp.data+" ");
            //     temp = temp.next;
            // }

            // do while Approach
            Node temp = head;
            do{
                System.out.print(temp.data+" ");
                temp = temp.next;
            }while(temp != head);
        }
    }
    public static void main(String[] args) {

    }
}
