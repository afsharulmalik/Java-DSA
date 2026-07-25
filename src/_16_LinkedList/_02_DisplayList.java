package _16_LinkedList;

//class Node{  // Node data type
//    int val;
//    Node next;  // iske andar node datatype hai   Default value null hai
//    Node(int val){
//        this.val = val;
//    }
//}
public class _02_DisplayList {

    // displaying using Recursion
    public static void displayRec(Node head){
        if(head == null) return; // base case
        System.out.print(head.val+" ");
        displayRec(head.next);
    }

    // this method is used to display elements of linked list
    // while loop
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;  // VERY IMPORTANT
        }
        System.out.println();
    }

    //  this will be used to find an element present at any index
    private static int get(Node head, int idx){
        Node temp = head;
        for(int i=1; i<=idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }


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
        display(a);
        displayRec(a);
        System.out.println(get(a,3));
    }
}
