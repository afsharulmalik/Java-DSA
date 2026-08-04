package _16_LinkedList;

public class _40_GFGRemoveDuplicateFromSortedDLL {
//     Structure of a link list node
class Node {
    int data;  // value stored in node
    Node next;
    Node prev;

    Node(int value) {
        data = value;
        next = null;
        prev = null;
    }
}

    class Solution {
        Node removeDuplicates(Node head) {
            if (head == null) return null;
            Node temp = head;
            while(temp != null && temp.next != null){
                if(temp.data == temp.next.data){
                    Node duplicate = temp.next;
                    temp.next = duplicate.next;
                    if(duplicate.next != null){
                        duplicate.next.prev = temp;
                    }
                }else{
                    temp = temp.next;
                }
            }
            return head;
        }
    }
    public static void main(String[] args) {

    }
}
