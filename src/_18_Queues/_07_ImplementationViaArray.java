package _18_Queues;

public class _07_ImplementationViaArray {
    static class CircularQueue{
        private int[] arr;
        private int size;
        private int front;
        private int rear;
        CircularQueue(int capacity){
            arr = new int[capacity];
        }

        // adding elements or nodes
        void enqueue(int val){
            if(size == arr.length){
                System.out.println("Queue is FULL !");
                return;
            }
            arr[rear++] = val;
            if(rear == arr.length) rear = 0;
            size++;
        }

        // remove karna
        int dequeue(){
            if(size == 0){
                System.out.println("Queue is EMPTY !");
                return -1;
            }
            int frontVal = arr[front];
            front++;
            if(front == arr.length) front = 0;
            size--;
            return frontVal;
        }

        //sneak peek
        int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

        // displaying
        void display(){
            if(size == 0) return;
            if(front >= rear){
                for(int i=front; i<arr.length; i++){ // front se rear tak
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<rear; i++){ // start se rear - 1 tak
                    System.out.print(arr[i]+" ");
                }
            }else{
                for(int i=front; i<rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(8);
        q.enqueue(19);
        q.enqueue(67);
        q.enqueue(56);
        q.enqueue(90);
        q.display();  // 19 67 56 90
        System.out.println(q.dequeue()); // 19
        System.out.println(q.dequeue()); // 67
        q.enqueue(4);
        q.enqueue(88);
        System.out.println(q.peek()); // 56
        System.out.println(q.peek()); // 56
        System.out.println(q.dequeue()); //56
        q.display(); // 90 4 88
    }
}
