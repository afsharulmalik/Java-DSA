package _16_LinkedList;

public class _42_LC138CloneListWithRandomPointer {

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
        // Step 4 : Split the merged list into original and copied list
        public void splitList(Node head1) {
            Node temp1 = head1;
            Node temp2 = head1.next;
            while (temp1 != null && temp2 != null) {
                temp1.next = temp2.next;
                temp1 = temp1.next;
                if (temp1 != null) {
                    temp2.next = temp1.next;
                    temp2 = temp2.next;
                }
            }
        }

        // Step 3 : Assign random pointers
        public void randomConnection(Node head1) {
            Node temp1 = head1;
            while (temp1 != null) {
                if (temp1.random != null) {
                    temp1.next.random = temp1.random.next;
                }
                temp1 = temp1.next.next;
            }
        }

        // Step 2 : Merge both lists alternatively
        public void merge(Node head1, Node head2) {
            Node temp1 = head1;
            Node temp2 = head2;
            while (temp1 != null && temp2 != null) {
                Node next1 = temp1.next;
                Node next2 = temp2.next;
                temp1.next = temp2;
                temp2.next = next1;
                temp1 = next1;
                temp2 = next2;
            }
        }

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

        public Node copyRandomList(Node head1) {
            if (head1 == null)
                return null;
            // Step 1 : Deep copy banao
            Node head2 = deepCopy(head1);
            // Step 2 : merge karo
            merge(head1, head2);
            // Step 3 : assigning random connection
            randomConnection(head1);
            // Step 4 : split the list
            splitList(head1);
            return head2;
        }
    }
    public static void main(String[] args) {

    }
}
