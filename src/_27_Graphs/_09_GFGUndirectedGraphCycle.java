package _27_Graphs;

import java.util.ArrayList;

public class _09_GFGUndirectedGraphCycle {
    class Solution {
        private boolean dfs(int i, int parent,
                            ArrayList<ArrayList<Integer>> adj,
                            boolean[] visited) {

            visited[i] = true;

            for (int ele : adj.get(i)) {

                if (!visited[ele]) {

                    if (dfs(ele, i, adj, visited)) {
                        return true;
                    }

                } else if (ele != parent) {
                    return true;
                }
            }

            return false;
        }

        public boolean isCycle(int n, int[][] edges) {

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }

            for (int[] edge : edges) {
                int a = edge[0];
                int b = edge[1];

                adj.get(a).add(b);
                adj.get(b).add(a);
            }

            boolean[] visited = new boolean[n];

            for (int i = 0; i < n; i++) {

                if (!visited[i]) {

                    if (dfs(i, -1, adj, visited)) {
                        return true;
                    }
                }
            }

            return false;
        }
    }
}
