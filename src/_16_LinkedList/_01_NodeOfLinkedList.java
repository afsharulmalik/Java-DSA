package _16_LinkedList;

//class Node{  // Node data type
//    int val;
//    Node next;  // iske andar node datatype hai   Default value null hai
//    Node(int val){
//        this.val = val;
//    }
//}
public class _01_NodeOfLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10);  // object bnaye
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(a.next.next.next.val);  // 40
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
    }
}
