package _27_Graphs;
import java.util.*;
public class _12_LC802EventualSafeStates {


    /*
     * adjacency list banao
     * graph banao
     * outdegree calculate karo
     * outdegree == 0 -> Queue
     * Khan's algorithm lagao*/

    class Solution {
        public List<Integer> eventualSafeNodes(int[][] graph) {
            List<List<Integer>> adj = new ArrayList<>();
            List<Integer> ans = new ArrayList<>();
            int n = graph.length;
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>());
            }

            int[] outdegree = new int[n];
            for(int i=0; i<n; i++){
                outdegree[i] = graph[i].length;
                for(int next : graph[i]){
                    adj.get(next).add(i);
                }
            }

            Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<n; i++){
                if(outdegree[i]==0) q.add(i);
            }

            int idx = 0;
            while(!q.isEmpty()){
                int front = q.remove();
                ans.add(front);
                for(int ele : adj.get(front)){
                    outdegree[ele]--;
                    if(outdegree[ele]==0){
                        q.add(ele);
                    }
                }
            }
            Collections.sort(ans);
            return ans;
        }
    }
}
