package _28_StriverGraphs;
import java.util.*;
public class _04_LC547NoOfProvinces {
    // striver : bfs hai apna

// approach : jab v ek naya bfs start hoga tab hi count increase karega jaise ke ek mein
// 3 node hai and all are connected toh count 1 hi rahega jaise hi dusra graph start hoga tab jaake count badhega
// bfs and dfs dono kiye hai taaki revise krne mein aasan ho and dono concept pataa ho mereko

    class Solution {
        // helper function bfs wala
        public void bfs(int start, int[][] isConnected, boolean[] isVisited){
            isVisited[start] = true; // first node ko true kar diye
            Queue<Integer> q = new LinkedList<>(); // queue ki help se karenge
            q.add(start);
            while(!q.isEmpty()){
                int front = q.remove();
                for(int i=0; i<isConnected.length;i++){
                    if(isConnected[front][i]==1 && isVisited[i]==false){
                        q.add(i);
                        isVisited[i]=true;
                    }
                }
            }
        }


        // helper function dfs wala
        public void dfs(int start, int[][] isConnected, boolean[] isVisited){
            isVisited[start] = true;
            for(int i=0; i<isConnected.length; i++){
                if(isConnected[start][i] == 1 && !isVisited[i]){
                    dfs(i,isConnected,isVisited);
                }
            }
        }


        // main function
        public int findCircleNum(int[][] isConnected) {
            int n = isConnected.length;
            int count = 0;
            boolean[] isVisited = new boolean[n]; // array bna diya ek jisme sab false hai abhi
            for(int i=0; i<n; i++){ // poore array par travel karo boolean wale
                if(isVisited[i]==false){ // jab tak ele false hai
                    // bfs(i,isConnected, isVisited); // tab tak

                    // ye isi question ko dfs se karne ka tareeka hai
                    dfs(i,isConnected, isVisited);
                    count++;
                }
            }
            return count;
        }
    }
}
