package _16_LinkedList;

public class _41_LC430FlattenMultiLevelDLL {

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};


    class Solution {
        public Node flatten(Node head) {
            if(head == null) return head;
            Node curr = head;
            while(curr != null){
                if(curr.child == null) curr = curr.next;
                else{
                    Node fwd = curr.next;
                    Node c = flatten(curr.child); // Recursive function
                    curr.child = null;  // recursive solution k baad curr k child ko null
                    curr.next = c;
                    c.prev = curr;
                    Node temp = c;
                    while(temp.next != null) temp = temp.next;
                    temp.next = fwd;
                    if(fwd != null) fwd.prev = temp;
                    curr = fwd;
                }
            }
            return head;
        }
    }
    public static void main(String[] args) {

    }
}
