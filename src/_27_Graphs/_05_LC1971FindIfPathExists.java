package _27_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _05_LC1971FindIfPathExists {
    class Solution {
        private void helper(int start, List<List<Integer>> list, boolean[] visited, int end) {
            Queue<Integer> q = new LinkedList<>();
            q.add(start);
            while(!q.isEmpty()){
                int front = q.remove();
                for(int ele : list.get(front)){
                    if(!visited[ele]){
                        visited[ele]=true;
                        q.add(ele);
                        if(ele == end) return;
                    }
                }
            }
        }
        public boolean validPath(int n, int[][] edges, int start, int end) {
            if(start==end) return true;
            List<List<Integer>> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                List<Integer> lists = new ArrayList<>();
                list.add(lists);
            }
            // adjacency list
            for(int i=0; i< edges.length; i++){
                int a = edges[i][0];
                int b = edges[i][1];
                list.get(a).add(b);
                list.get(b).add(a);
            }
            boolean[] visited = new boolean[n]; // false
            visited[start] = true;
            helper(start,list,visited,end);
            return visited[end];
        }
    }
}
