package _16_LinkedList;

// user defined data type
class Node{  // Node data type
    int val;
    Node next;  // iske andar node datatype hai   Default value null hai
    Node(int val){
        this.val = val;
    }
}

// user defined data structure
class Linkedlist {
    Node head; // null
    Node tail; // null
    int size;

    // this will add a node at the tail (end)
    void insertLast(int val){
        Node temp = new Node(val);  // ye temp node create kar dega
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    // this will add a node at the head
    void insertFirst(int val){
        Node temp = new Node(val);  // ye temp node create kar dega
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    // Delete at head
    void deleteAtHead() {
        if(head == null){
            System.out.print("List is empty.");
            return;
        }else{
            head = head.next;
        }
        size--;
    }
    // delete at tail
    public void deleteAtTail(){
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node curr = head;
        // Reach second last node
        while (curr.next != tail) {
            curr = curr.next;
        }
        curr.next = null;
        tail = curr;
        size--;
    }
    //Searching
    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int idx = 0;
        while(temp != null){
            if(temp.val == val) return idx;
            idx++;
            temp = temp.next;
        }
        return -1;
    }
    // Insert at any Index
    // Insert at any index
    void insertAtIndex(int index, int val){
        if(index < 0 || index > size){
            System.out.println("Invalid Index");
            return;
        }
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        // Traverse to (index - 1)th node
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    // Get
    int get(int idx){
        if(idx<0 || idx>=size) return -1;
        Node curr = head;
        for(int i=0; i<idx; i++){
            curr = curr.next;
        }
        return curr.val;
    }
    // Delete :- it means breaking and attaching connection
    void delete(int idx) {
        if (idx < 0 || idx >= size) return;  // base case
        if (idx == 0) {  // deleting 1st idx
            deleteAtHead();
            return;
        }
        if (idx == size - 1) {  // deleting last idx
            deleteAtTail();
            return;
        }
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;  // very important
        size--;
    }
    // Displaying
    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;  // VERY IMPORTANT
        }
        System.out.println();
    }
}

public class _03_LinkedListDataStructure {
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.insertLast(10);
        ll.insertLast(20);
        ll.insertLast(30);
        ll.insertLast(40);
        ll.insertLast(60);
        ll.insertLast(70);
        ll.insertLast(80);
        ll.display();  //  10 20 30 40 60 70 80

//        ll.insertFirst(50);
//        ll.display();  //  50 10 20 30 40 60 70 80

//        ll.deleteAtHead();
//        ll.display();  //  20 30 40 60 70 80

//        System.out.println(ll.search(40));  // 3
//        System.out.print(ll.size);  //  7

//        ll.insertAtIndex(3,100);
//        ll.display();  //  10 20 30 100 40 60 70 80

//        ll.insertAtIndex(12,100);  //  Invalid Index

//        System.out.print(ll.get(4));  // 60

//        ll.deleteAtTail();   // 80 delete
//        ll.display();   //  10 20 30 40 60 70

//        ll.delete(2);  // 30 delete
//        ll.display();   // 10 20 40 60 70 80
    }
}
