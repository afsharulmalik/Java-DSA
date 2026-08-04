package _16_LinkedList;

public class _37_LC708InsertIntoSortedCircularLL {
    //      Definition for singly-linked list.
    public class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }
    public Node insert(Node head, int insertVal) {
        Node newNode = new Node(insertVal);
        if(head == null){  // empty list
            newNode.next = newNode;
            return newNode;
        }
        Node curr = head;
        do{
            if(curr.val <= insertVal && insertVal <= curr.next.val) break;
            if(curr.val > curr.next.val){
                if(insertVal >= curr.val || insertVal <= curr.next.val) break;
            }
            curr = curr.next;
        }while (curr != head);
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
    public static void main(String[] args) {

    }
}
