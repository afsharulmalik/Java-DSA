package _27_Graphs;

import java.util.PriorityQueue;

public class _20_LC1584MinCostToConnectAllPoints {
    class Solution {
        public class Triplet implements Comparable<Triplet>{
            int node;
            int parent;
            int dist;
            Triplet(int node, int parent, int dist){
                this.node = node;
                this.dist = dist;
                this.parent = parent;
            }
            public int compareTo(Triplet t){
                if(this.dist==t.dist) return Integer.compare(this.node,t.node);
                return Integer.compare(this.dist, t.dist);
            }
        }
        public int minCostConnectPoints(int[][] points) {
            int n = points.length;
            PriorityQueue<Triplet> pq = new PriorityQueue<>();
            pq.add(new Triplet(0,-1,0));
            int sum = 0;
            boolean[] vis = new boolean[n];
            // vis[0]=true;
            while(!pq.isEmpty()){
                Triplet top = pq.remove();
                int node = top.node;
                int parent = top.parent;
                int dist = top.dist;
                if(vis[node]==true) continue;
                sum += dist;
                vis[node]=true;
                for(int i=0; i<n; i++){
                    if(i==node || i==parent) continue;
                    // if(i==node) continue;
                    if(vis[i]==true) continue;
                    int x1 = points[node][0];
                    int y1 = points[node][1];
                    int x2 = points[i][0];
                    int y2 = points[i][1];
                    int mDis = Math.abs(x2-x1) + Math.abs(y2-y1);
                    pq.add(new Triplet(i,node,mDis));
                }
            }
            return sum;
        }
    }
}
