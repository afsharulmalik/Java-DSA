package _21_Heaps;
import java.util.*;
public class _13_MinHeapImplementation {
    static class MinHeap{
        private int[] arr;
        private int size;
        private int capacity;
        MinHeap(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            size = 0;
        }
        // root ko dekhna means print karwana
        int peek(){ // O(1)
            if(size == 0){
                throw new RuntimeException("Heap is Empty");
            }
            return arr[0];
        }
        // heap mein ele ko add karna
        void add(int ele){ // O(logn)
            if(size == capacity){
                throw new RuntimeException("Heap is Full");
            }
            arr[size] = ele;
            int i = size;
            size++;
            // heapify kar rhe hai
            while(i>0){
                int parent = (i-1)/2;
                if(arr[parent]<=arr[i]) break;
                int temp = arr[parent];
                arr[parent] = arr[i];
                arr[i] = temp;
                i = parent;
            }
        }
        // removing an element
        int remove(){
            if(size == 0) throw new RuntimeException("Heap is Empty");
            int ans = arr[0];
            arr[0] = arr[size-1]; // move last element on root
            size--;
            int i = 0;
            // Heapify
            while(true){
                int left = 2*i+1;
                int right = 2*i+2;
                if(left>=size) break; // if no left child
                int smallerChild = left; // choose smaller child
                if (right < size && arr[right] < arr[left]) smallerChild = right;
                if(arr[i] <= arr[smallerChild]) break;
                int temp = arr[i];
                arr[i] = arr[smallerChild];
                arr[smallerChild] = temp;
                i = smallerChild;
            }
            return ans;
        }
        // heap display
        void display(){
            for(int nums : arr){
                System.out.print(nums+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MinHeap h = new MinHeap(7);
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(40);
        h.add(50);
        h.add(60);
        h.add(70);
        h.display();
        System.out.println(h.remove());
        h.display();
    }
}
