package _27_Graphs;
import java.util.*;

public class _18_LC787CheapestFlightsWithinKStops {
    class Pair {
        int node;
        int cost;

        Pair(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }
    }

    class Triplet implements Comparable<Triplet> {
        int node;
        int dist;
        int stops;

        Triplet(int node, int dist, int stops) {
            this.node = node;
            this.dist = dist;
            this.stops = stops;
        }

        public int compareTo(Triplet t) {
            //     if(this.dist==t.dist) return Integer.compare(this.node,t.node);
            return Integer.compare(this.dist, t.dist);
        }
    }

    class Solution {
        public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
            // new adj list banao
            List<List<Pair>> adj = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                adj.add(new ArrayList<>());
            }
            for (int i = 0; i < flights.length; i++) {
                int from = flights[i][0];
                int to = flights[i][1];
                int price = flights[i][2];
                adj.get(from).add(new Pair(to, price));
            }
            // new ans list banao
            int[][] ans = new int[n][k + 2];
            for (int[] row : ans) {
                Arrays.fill(row, Integer.MAX_VALUE);
            }
            ans[src][0] = 0;
            PriorityQueue<Triplet> pq = new PriorityQueue<>();
            pq.add(new Triplet(src, 0, 0));
            // djkistra algorithm
            while (!pq.isEmpty()) {
                Triplet top = pq.remove();
                int node = top.node;
                int dist = top.dist;
                int stops = top.stops;
                if (node == dst)
                    return dist; // ans[node] return krenge ?
                if (stops == k + 1)
                    continue;
                for (Pair p : adj.get(node)) {
                    int totalCost = dist + p.cost;
                    int newStops = stops + 1;
                    if (newStops <= k + 1 &&
                            totalCost < ans[p.node][newStops]) {
                        ans[p.node][newStops] = totalCost;
                        pq.add(new Triplet(p.node, totalCost, newStops));
                    }
                }
                // if(ans[dst]==Integer.MAX_VALUE) return -1;
            }
            return -1;
        }
    }
}
