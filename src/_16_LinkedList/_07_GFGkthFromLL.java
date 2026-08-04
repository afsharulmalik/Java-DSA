package _16_LinkedList;

public class _07_GFGkthFromLL {

//     Structure of Linked List Node  ye banaa hua rahega
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}

// maine yha se solve kiya hai
    class Solution {
        public int getKthFromLast(Node head, int k) {
            Node slow = head;
            Node fast = head;
            // fast ko k tak le jao
            for(int i=1; i<=k; i++){
                if(fast == null) return -1;
                fast = fast.next;
            }
            while(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
    }
    public static void main(String[] args) {

    }
}
