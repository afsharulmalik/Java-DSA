package _27_Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _07_LC785IsGraphBipertite {
    class Solution {
        static boolean ans; // global variable
        private void bfs(int i, int[][] graph, int[] visited) {
            Queue<Integer> q = new LinkedList<>();
            visited[i]=0; // 1 means red and 0 means blue
            q.add(i);
            while(!q.isEmpty()){
                int front = q.remove();
                int color = visited[front];
                for(int ele : graph[front]){
                    if(visited[ele]==visited[front]){
                        ans = false;
                        return;
                    }
                    if(visited[ele]==-1){
                        visited[ele]=1-color;
                        q.add(ele);
                    }
                }
            }
        }
        // main function
        public boolean isBipartite(int[][] graph) {
            ans = true;
            int n = graph.length;
            int[] visited = new int[n];
            Arrays.fill(visited,-1);
            for(int i=0; i<n; i++){
                if(ans == false) return ans;
                if(visited[i]==-1) bfs(i,graph,visited);
            }
            return ans;
        }
    }
}
