package _28_StriverGraphs;
import java.util.*;
public class _03_GFGdfsOfGraph {
    class Solution{
        // striver wala hai
        // helper function
        public void dfsHelper(int start, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans){
            visited[start] = true;
            ans.add(start);
            for(int ele : adj.get(start)){
                if(!visited[ele]){
                    dfsHelper(ele,visited, adj, ans);
                }
            }
        }
        public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj){
            int n = adj.size();
            boolean[] visited = new boolean[n];
            ArrayList<Integer> ans = new ArrayList<>();
            dfsHelper(0,visited,adj, ans);
            return ans;
        }
    }
}
