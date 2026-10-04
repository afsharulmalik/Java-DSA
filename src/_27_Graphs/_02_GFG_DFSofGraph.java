package _27_Graphs;
import java.util.*;
public class _02_GFG_DFSofGraph {
    class Solution {
        private void helper(int start, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans) {
            visited[start]=true;
            ans.add(start);
            for(int ele : adj.get(start)){
                if(!visited[ele]){
                    helper(ele,adj,visited,ans);
                }
            }
        }
        public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
            int n = adj.size();
            boolean[] visited = new boolean[n];
            ArrayList<Integer> ans = new ArrayList<>();
            helper(0,adj,visited,ans);
            return ans;
        }
    }
}
