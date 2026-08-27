package _21_Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class _14_LC295MedianFromDataStream {
    // This approach will give TLE
    class MedianFinderTLE {
        ArrayList<Integer> arr;
        public MedianFinderTLE() {
            arr = new ArrayList<>();
        }

        public void addNum(int num) {
            arr.add(num);
        }

        public double findMedian() {
            Collections.sort(arr);
            int n = arr.size();
            if(n%2 == 1) return (double) arr.get(n/2); // 1 2 3 4 5            // 1 2 3 4 5 6
            else return (double) (arr.get(n/2) + arr.get(n/2-1))/2;
        }
    }

    // Optimal Approach
    class MedianFinder {
        private PriorityQueue<Integer> max; // maxHeap on left side
        private PriorityQueue<Integer> min; // minHeap on right side
        public MedianFinder() {
            max = new PriorityQueue<>(Collections.reverseOrder());
            min = new PriorityQueue<>();
        }

        public void addNum(int num) {
            if(max.isEmpty() || num<=max.peek()) max.add(num);
            else min.add(num);

            if(max.size() - min.size() > 1) min.add(max.remove());
            if(min.size() - max.size() > 1) max.add(min.remove());
        }

        public double findMedian() {
            if(max.size()>min.size()) return max.peek();
            else if(min.size()>max.size()) return min.peek();
            else return (max.peek() + min.peek())/2.0;
        }
    }

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
}
