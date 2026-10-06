package _27_Graphs;
import java.util.*;
public class _08_GFGTopologicalSort {
    class Solution {
        // dfs kya karega
//        node visited karo
//                ↓
//        uske neighbours par DFS
//                ↓
//        node ko answer mein add karo



//        // main function kya karega
//        0 se V-1 tak jao
//                ↓
//        agar unvisited hai
//                ↓
//        DFS call
//                ↓
//        answer reverse


        // concept
//        Dependency/order chahiye
//              ↓
//        Topological Sort
//              ↓
//        DFS approach
//              ↓
//        Neighbour ko pehle complete karo
//              ↓
//        Current node ko baad mein add karo
//              ↓
//        visited se repeat avoid karo
//              ↓
//        har unvisited node se DFS
//              ↓
//        reverse answer


        private void dfs(int i, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
            visited[i]=true;
            for(int ele : adj.get(i)){
                if(!visited[ele]){
                    dfs(ele,visited,adj,ans);
                }
            }
            ans.add(i);
        }
        // main function
        public ArrayList<Integer> topoSort(int V, int[][] edges) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>(); // empty arraylist
//            graph ki adjacency list banane ke liye empty lists create kar raha hai.
            for(int i=0; i<V; i++){
                adj.add(new ArrayList<>());
            }
            // graph bnega
            for(int[] edge : edges){
                int a = edge[0];
                int b = edge[1];
                adj.get(a).add(b);
            }
            boolean[] visited = new boolean[V];
            ArrayList<Integer> ans = new ArrayList<>();
            // dfs lagao
            for(int i=0; i<V; i++){
                if(!visited[i]){
                    dfs(i,visited,adj,ans);
                }
            }
            Collections.reverse(ans);
            return ans;
        }
    }
}


// BFS WALA CONCEPT

//Dependency hai → Topological Sort.
//BFS karna hai → hume decide karna hoga kaunse nodes abhi process ho sakte hain.
//Jinke paas koi incoming edge nahi hai, unka indegree = 0.
//Un nodes ko Queue mein daal do.
//Queue se node nikalo → uske neighbours ko process karo → unka indegree--.
//Jiska indegree 0 ho jaye → Queue mein daal do.
//Ye repeat karo.


//Graph banao
//   ↓
//Indegree calculate karo
//   ↓
//Indegree 0 → Queue
//   ↓
//Queue se node nikalo
//   ↓
//Answer mein add
//   ↓
//Neighbours ka indegree--
//        ↓
//Indegree 0 → Queue
//   ↓
//Repeat

class bfsSolution{
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // 1. Adjacency List
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        // 2. Graph banana + indegree calculate karna
        int[] indegree = new int[V];
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            indegree[b]++;
        }
        // 3. Indegree 0 wale nodes Queue mein
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        // 4. BFS
        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.remove();
            ans.add(node);
            // Current node ke neighbours
            for (int ele : adj.get(node)) {
                indegree[ele]--;
                // Ab koi prerequisite nahi bacha
                if (indegree[ele] == 0) {
                    q.add(ele);
                }
            }
        }
        return ans;
    }
}