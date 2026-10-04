package _27_Graphs;
import java.util.*;
public class _04_LC841KeysAndRooms {
    class Solution {
        public void bfs(int start, List<List<Integer>> rooms, boolean[] visited){
            Queue<Integer> q = new LinkedList<>();
            q.add(start);
            while(!q.isEmpty()){
                int front = q.remove();
                for(int ele : rooms.get(front)){
                    if(!visited[ele]){
                        visited[ele]=true;
                        q.add(ele);
                    }
                }
            }
        }
        // Main function hai
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int n = rooms.size();
            boolean[] visited = new boolean[n]; // by default false hota hai
            visited[0]=true; // start yhi se kar rhe hai isiliye phle mark kar liye
            bfs(0,rooms,visited);
            for(boolean ele : visited){
                if(ele == false) return false;
            }
            return true;
        }
    }
}
