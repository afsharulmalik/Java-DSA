package _18_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class _02_TraversalInQueue {

    // add at any index
    private static void addAtIdx(Queue<Integer> q, int idx, int val){
        if(idx<0 || idx>q.size()){
            System.out.println("Invalid Index");
            return;
        }
        int n = q.size();
        if(idx<n){
            for(int i=0; i<idx; i++){
                q.add(q.remove());
            }
        }
        q.add(val);
        for(int i=0; i<n-idx; i++){
            q.add(q.remove());
        }
    }

    // peek at idx
    private static int peekAtIdx(Queue<Integer> q, int idx){
        int n = q.size();
        if(idx>n || idx<0) return -1; // invalid index
        for(int i=0; i<idx; i++){
            q.add(q.remove());
        }
        int ans = q.peek();
        for(int i=0; i<n-idx; i++){
            q.add(q.remove());
        }
        return ans;
    }

    // remove at index
    private static int removeAtIdx(Queue<Integer> q, int idx){
        int n = q.size();
        if(idx>=n || idx<0) return -1;
        for(int i=0; i<idx; i++){
            q.add(q.remove());
        }
        int ans = q.remove();
        for(int i=0; i<n-idx-1; i++){
            q.add(q.remove());
        }
        return ans;
    }

    // printing
    private static void display(Queue<Integer> q){
        int n = q.size();
        for(int i=0; i<n; i++){
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(67);
        q.add(78);
        q.add(69);
        display(q);  // 10 67 78 69
        addAtIdx(q,2,99);
        display(q);  // 10 67 99 78 69
        System.out.println(peekAtIdx(q, 3));  // 78
        display(q);  // 10 67 99 78 69
        System.out.println(removeAtIdx(q, 1));  // 67
        display(q); // 10 99 78 69
    }
}
