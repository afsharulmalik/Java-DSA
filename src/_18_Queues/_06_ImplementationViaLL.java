package _18_Queues;
import java.util.*;
public class _06_ImplementationViaLL {
    static class QueueLL {
        static class Node{
            int val;
            Node next;
            Node(int val){  // constructor
                this.val = val;
            }
        }
        Node front;
        Node rear;
        int size;

        // adding element
        void enqueue(int val){
            Node newNode = new Node(val);
            if(front == null) front = rear = newNode; //empty queue
            else{
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        // removing element
        int dequeue(){
            if(front == null){ // queue hi empty hai
                System.out.print("Queue is empty");
                return -1;
            }
            int ans = front.val;
            front = front.next;
            if(front == null) rear = null; // last element v remove ho gya
            size--;
            return ans;
        }

        // sneak peek
        int peek(){
            if(front == null) return -1;
            return front.val;
        }

        // checking if there is any element in queue
        boolean isEmpty(){
            return front == null;
        }

        // size of queue
        int size(){
            return size;
        }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.peek()); // 10
        System.out.println(q.size()); // 4

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20

        System.out.println(q.peek()); // 30
        System.out.println(q.size()); //2

        q.enqueue(59);
        q.enqueue(67);

        System.out.println(q.peek()); // 30

        System.out.println(q.dequeue()); // 30
        System.out.println(q.dequeue()); // 40
        System.out.println(q.peek()); // 59
    }
}
