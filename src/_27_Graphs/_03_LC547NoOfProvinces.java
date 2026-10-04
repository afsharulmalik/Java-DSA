package _27_Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class _03_LC547NoOfProvinces {
    class Solution {
        private void bfs(int i, boolean[] isVisited, int[][] isConnected) {
            isVisited[i] = true;
            Queue<Integer> q = new LinkedList<>();
            while(!q.isEmpty()){
                int front = q.remove(); // row
                for(int j=0; j<isConnected.length; j++){
                    if(isConnected[front][j]==1 && isVisited[j]==false){
                        q.add(j);
                        isVisited[j]=true;
                    }
                }
            }
        }
        // main function
        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;
            int count = 0;
            boolean[] isVisited = new boolean[n];
            for(int i=0; i<n; i++){
                if(!isVisited[i]){
                    bfs(i,isVisited,isConnected);
                    count++;
                }
            }
            return count;
        }
    }
}
