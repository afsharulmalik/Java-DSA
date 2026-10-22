package _27_Graphs;
import java.util.*;
public class _01_GFG_BFSofGraph {
    class Solution {
        public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
            // striver ka concept
            int n = adj.size(); // size of adj
            ArrayList<Integer> ans = new ArrayList<>();
            boolean[] visited = new boolean[n]; // new boolean array bna liye
            Queue<Integer> q = new LinkedList<>();
            q.add(0); // q mein add
            visited[0] = true; // true mark ho gya
            while(!q.isEmpty()){
                int front = q.remove();
                ans.add(front); // arraylist mein front jo nikale usko add kar diye
                for(int ele : adj.get(front)){
                    if(!visited[ele]){
                        visited[ele]=true;
                        q.add(ele);
                    }
                }
            }
            return ans;
        }
    }




    // ye raghav sir wala solution hai
    class RaghavSolution {
        private void helper(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans) {
            Queue<Integer> q = new LinkedList<>();
            q.add(start);
            while (!q.isEmpty()) {
                int front = q.remove();
                ans.add(front);
                for (int ele : adj.get(front)) {
                    if (!visited[ele]) {
                        visited[ele] = true;
                        q.add(ele);
                    }
                }
            }
        }
        public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
            int n = adj.size();
            boolean[] visited = new boolean[n];
            visited[0]=true;
            ArrayList<Integer> ans = new ArrayList<>();
            helper(0, adj, visited, ans);
            return ans;
        }
    }
}
