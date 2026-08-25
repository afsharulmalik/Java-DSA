package _21_Heaps;
import java.util.*;
public class _04_GFGNearlySorted {
//    First k+1 elements → Min Heap
//
//while elements remain:
//    minimum nikalo → answer
//    next element heap mein daalo
//
//    Finally:
//    heap ke remaining elements answer mein daalo

    class AiSolution {
        public void nearlySorted(int[] arr, int k) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int n = arr.length;
            int index = 0;
            for(int i=0; i<=k && i<n; i++) pq.add(arr[i]);
            for(int i=k+1; i<n; i++){
                arr[index++] = pq.remove();
                pq.add(arr[i]);
            }
            while(!pq.isEmpty()) arr[index++] = pq.remove();
        }
    }



    // alternate solution
    class AlternateSolution {
        public void nearlySorted(int[] arr, int k){
            int idx = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int ele : arr){
                pq.add(ele);
                if(pq.size()>k) arr[idx++] = pq.remove();
            }
            while(!pq.isEmpty()) arr[idx++] = pq.remove();
        }
    }

}
