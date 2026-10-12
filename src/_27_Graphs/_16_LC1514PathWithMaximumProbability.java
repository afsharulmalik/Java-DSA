package _27_Graphs;

import java.util.*;

public class _16_LC1514PathWithMaximumProbability {
    class Pair implements Comparable<Pair>{
        int node;
        double prob;
        Pair(int node, double prob){
            this.node = node;
            this.prob = prob;
        }
        public int compareTo(Pair p){
            if(this.prob==p.prob) return this.node - p.node;
            return Double.compare(p.prob,this.prob);
        }
    }
    class Solution {
        public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
            // minheap lagega, adj list, priority queue, custom comparator, pair data types, multiplication concept
            List<List<Pair>> adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0; i<edges.length; i++){
                int u = edges[i][0];
                int v = edges[i][1];
                double prob = succProb[i];
                adj.get(u).add(new Pair(v,prob));
                adj.get(v).add(new Pair(u,prob));
            }
            double[] ans = new double[n];
            ans[start] = 1; // start node ko 1 se initialize kar diye
            PriorityQueue<Pair> pq = new PriorityQueue<>(); // minheap banega issey
            pq.add(new Pair(start,1));
            while(!pq.isEmpty()){
                Pair top = pq.remove();
                if(top.prob<ans[top.node]) continue;
                if (top.node == end) return top.prob;
                for(Pair p : adj.get(top.node)){
                    double totalProb = top.prob * p.prob;
                    if(totalProb > ans[p.node]){
                        ans[p.node] = totalProb;
                        pq.add(new Pair(p.node,totalProb));
                    }
                }
            }
            return ans[end];
        }
    }
}
