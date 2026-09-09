package _22_Sets_And_Maps;

import java.util.HashMap;

public class _19_LC138CopyListWithRandomPointer {
    // already solved using linked list
    // hashmap approach

// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


    class Solution {
        // Step 1 : Deep copy without random pointers
        public Node deepCopy(Node head1) {
            Node dummy = new Node(-1);
            Node temp2 = dummy;
            Node temp1 = head1;
            while (temp1 != null) {
                temp2.next = new Node(temp1.val);
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
            return dummy.next;
        }
        public Node copyRandomList(Node a) {
            Node b = deepCopy(a);
            HashMap<Node, Node> map = new HashMap<>(); // <original, duplicate>
            Node tempA = a;
            Node tempB = b;
            map.put(null, null);
            while(tempA != null){ // storing in hashmap
                map.put(tempA, tempB);
                tempA = tempA.next;
                tempB = tempB.next;
            }
            tempA = a;
            while (tempA != null){
                tempB = map.get(tempA);
                tempB.random = map.get(tempA.random);
                tempA = tempA.next;
            }
            return b;
        }
    }
}
