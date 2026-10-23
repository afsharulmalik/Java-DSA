package _28_StriverGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class _02_GFGbfsOfGraph {
    class Solution {
        public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
            // striver ka concept
            int n = adj.size(); // size of adj
            ArrayList<Integer> ans = new ArrayList<>(); // ye ans hai jo last mein return hoga
            boolean[] visited = new boolean[n]; // new boolean array bna liye
            Queue<Integer> q = new LinkedList<>();
            q.add(0); // q mein add
            visited[0] = true; // true mark ho gya
            while(!q.isEmpty()){  // jab tak queue khali nahi ho jaata hai
                int front = q.remove();  // queue ke andar wala element nikalo
                ans.add(front); // arraylist mein front jo nikale usko add kar diye
                for(int ele : adj.get(front)){  // Ye loop current node ke har neighbour par ek-ek karke chalega.
                    if(!visited[ele]){
                        visited[ele]=true;
                        q.add(ele);
                    }
                }
            }
            return ans;
        }
    }
}
