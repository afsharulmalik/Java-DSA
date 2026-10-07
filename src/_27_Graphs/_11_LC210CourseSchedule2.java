package _27_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _11_LC210CourseSchedule2 {
    // approach
//    [course, prerequisite]
//            ↓
//    prerequisite → course
//       ↓
//    adjacency list
//       ↓
//    indegree calculate
//       ↓
//    indegree == 0 → Queue
//       ↓
//    Kahn's BFS
//            ↓
//    processed courses → answer[]
    class Solution {
        public int[] findOrder(int n, int[][] prerequisites) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>()); // adjacency list
            }

            int[] indegree = new int[n]; // indegree array
            for(int[] pre : prerequisites){ // graph
                int a = pre[0];
                int b = pre[1];
                adj.get(b).add(a); // node 0 -> 1 but idhar graph hai 1 -> 0
                indegree[a]++;
            }
            // indegree 0 wala queue mein
            Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<n; i++){
                if(indegree[i]==0) q.add(i);
            }
            // khan's Algorithm lagega ab
            int[] ans = new int[n];
            int idx = 0;
            while(!q.isEmpty()){
                int front = q.remove();
                ans[idx++]=front;
                for(int ele : adj.get(front)){
                    indegree[ele]--;
                    if(indegree[ele]==0) q.add(ele);
                }
            }
            // check cycle
            if(idx!=n) return new int[0]; // empty array
            return ans;
        }
    }
}
