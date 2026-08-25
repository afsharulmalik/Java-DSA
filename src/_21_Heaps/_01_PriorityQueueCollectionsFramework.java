package _21_Heaps;

import java.util.PriorityQueue;

public class _01_PriorityQueueCollectionsFramework {
    public static void main(String[] args) {
        // Min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(-10);
        pq.add(50);
        System.out.println(pq.peek());  // -10
        System.out.println(pq.size()); // 3
        System.out.println(pq.remove()); // -10
        pq.add(60);
        System.out.println(pq.peek()); // 10
        System.out.println(pq); // 10 50 60
    }
}
