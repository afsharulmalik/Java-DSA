package _27_Graphs;

import java.util.*;

public class _10_LC207CourseSchedule {
    class Solution {
        private boolean dfs(int i, List<List<Integer>> adj, boolean[] visited, boolean[] pathVisited){
            visited[i]=true;
            pathVisited[i]=true;
            for(int ele : adj.get(i)){
                if(!visited[ele]){
                    if(dfs(ele,adj,visited,pathVisited)){
                        return true;
                    }
                }else if(pathVisited[ele]){
                    return true;
                }
            }
            pathVisited[i]=false;
            return false;
        }
        public boolean canFinish(int n, int[][] prerequisites) {
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>()); // ye empty graph banega
            }
            for(int[] pre : prerequisites){
                int a = pre[0];
                int b = pre[1];
                adj.get(b).add(a); // 0->1 hai toh 1 -> 0
            }
            boolean[] visited = new boolean[n];
            boolean[] pathVisited = new boolean[n];
            for(int i=0; i<n; i++){
                if(!visited[i]){
                    if(dfs(i,adj,visited,pathVisited))
                    return false;
                }
            }
            return true;
        }
    }
}


// raghav solution
class RaghavSolution {
    static boolean ans;
    private boolean dfs(int i, List<List<Integer>> adj, boolean[] visited, boolean[] pathVisited){
        visited[i]=true;
        pathVisited[i]=true;
        for(int ele : adj.get(i)){
            if(pathVisited[ele]==true){
                ans = false; // mtob yha par cycle hai
                return ans;
            }
            if(visited[ele]==false) dfs(ele,adj, visited, pathVisited);
        }
        return pathVisited[i]=false;
    }
    public boolean canFinish(int n, int[][] prerequisites) {
        ans = true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>()); // ye empty graph banega
        }
        for(int[] pre : prerequisites){
            int a = pre[0];
            int b = pre[1];
            adj.get(b).add(a); // 0->1 hai toh phle 1 phir 0
        }
        boolean[] visited = new boolean[n];
        boolean[] pathVisited = new boolean[n];
        for(int i=0; i<n; i++){ // saare elements par lagane ke liye loop lagega
            if(visited[i]==false) dfs(i,adj,visited,pathVisited);
        }
        return ans;
    }
}