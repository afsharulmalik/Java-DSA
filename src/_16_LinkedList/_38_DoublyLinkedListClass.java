package _16_LinkedList;
class ListNode{  // user defined data types
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;

    // Inserting At Head
    void insertFirst(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    // Inserting At Last
    void insertLast(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    // Delete At Head
    void deleteFirst(){
        if(head == null){
            System.out.print("Head Is Null.");
            return;
        }
        if(size==1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    // Delete At Tail
    void deleteLast(){
        if(head == null){
            System.out.print("Invalid List.");
            return;
        }
        if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    // Delete At Node
    void insertAtIndex(int idx, int val){
        if(idx < 0 || idx > size){
            System.out.print("Invalid Index");
            return;
        }
        if(idx == 0){
            insertFirst(val);
            return;
        }
        if(idx == size){
            insertLast(val);
            return;
        }
        ListNode a = new ListNode(val);
        ListNode temp = head;
        for(int i = 0; i<idx-1; i++){
            temp = temp.next;
        }
        a.prev = temp;
        a.next = temp.next;
        temp.next = a;
        a.next.prev = a;
        size++;
    }
    // delete at any idx
    void deleteAtIndex(int idx){
        if(idx < 0 || idx > size){
            System.out.print("Invalid Index");
            return;
        }
        if(idx == 0){
            deleteFirst();
            return;
        }
        if(idx == size-1){
            deleteLast();
            return;
        }
        ListNode temp = head;
        for(int i=0; i< idx; i++){
            temp = temp.next;
        }
        ListNode prev = temp.prev;
        ListNode next = temp.next;
        prev.next = next;
        next.prev = prev;
        size--;
    }
    // Display
    void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    // Display Reverse
    void displayReverse(){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
public class _38_DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(30);
        list.insertFirst(40);
        list.display();   // 40 30 20 10

        list.insertLast(100);
        list.insertLast(200);
        list.insertLast(300);
        list.insertLast(400);
        list.display();  // 40 30 20 10 100 200 300 400
        list.displayReverse();  // 400 300 200 100 10 20 30 40

        list.deleteFirst();
        list.deleteLast();
        list.display();  // 30 20 10 100 200 300

        list.insertAtIndex(2,67);
        list.display();  // 30 20 67 10 100 200 300

        list.deleteAtIndex(2);
        list.display(); // 30 20 10 100 200 300 
    }
}
