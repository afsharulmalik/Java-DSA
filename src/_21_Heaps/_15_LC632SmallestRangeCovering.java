package _21_Heaps;
import java.util.*;
public class _15_LC632SmallestRangeCovering {

    /*
    1. Har list ka first element MinHeap mein daalo
    2. Current maximum maintain karo
    3. min = heap.peek()
    4. [min, max] current range hai
    5. Best range update karo
    6. min element ko poll karo
    7. Uski list ka next element heap mein daalo
    8. max update karo
    9. Kisi list ka next element na mile → stop

    Key Idea :-
    Minimum ko move karo, maximum ko track karo.
    Minimum element jis list se आया है, उसी list का next element heap mein डालना hai. यही पूरी trick hai

    Time  → O(N log k)
    Space → O(k)
    */

    class Solution {
        class Node implements Comparable<Node> {
            int value;
            int listIndex;
            int elementIndex;

            Node(int value, int listIndex, int elementIndex) {
                this.value = value;
                this.listIndex = listIndex;
                this.elementIndex = elementIndex;
            }

            @Override
            public int compareTo(Node other) {
                return this.value - other.value;
            }
        }
        public int[] smallestRange(List<List<Integer>> nums) {
            PriorityQueue<Node> pq = new PriorityQueue<>();
            int max = Integer.MIN_VALUE;
            // Har list ka first element heap mein daalo
            for (int i = 0; i < nums.size(); i++) {
                int value = nums.get(i).get(0);
                pq.add(new Node(value, i, 0));
                max = Math.max(max, value);
            }
            int bestLeft = 0;
            int bestRight = Integer.MAX_VALUE;
            while (true) {
                // Current minimum
                Node minNode = pq.poll();
                int min = minNode.value;
                // Current range = [min, max]
                if (max - min < bestRight - bestLeft) {
                    bestLeft = min;
                    bestRight = max;
                }
                // Is list ka next element
                int nextIndex = minNode.elementIndex + 1;
                int listIndex = minNode.listIndex;
                // Agar next element nahi hai,
                // toh aage valid range banana possible nahi
                if (nextIndex >= nums.get(listIndex).size()) {
                    break;
                }
                int nextValue = nums.get(listIndex).get(nextIndex);
                pq.add(new Node(nextValue, listIndex, nextIndex));
                // Maximum update
                max = Math.max(max, nextValue);
            }
            return new int[]{bestLeft, bestRight};
        }
    }
}


