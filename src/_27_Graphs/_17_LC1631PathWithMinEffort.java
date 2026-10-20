package _27_Graphs;

import java.util.*;

public class _17_LC1631PathWithMinEffort {
    class Solution {
        public int minimumEffortPath(int[][] heights) {
            int m = heights.length;
            int n = heights[0].length;

            // Har cell tak pahunchne ka minimum effort
            int[][] dist = new int[m][n];

            for (int i = 0; i < m; i++) {
                Arrays.fill(dist[i], Integer.MAX_VALUE);
            }

            // {effort, row, col}
            PriorityQueue<int[]> pq = new PriorityQueue<>(
                    (a, b) -> Integer.compare(a[0], b[0])
            );

            dist[0][0] = 0;
            pq.offer(new int[]{0, 0, 0});

            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};

            while (!pq.isEmpty()) {
                int[] curr = pq.poll();

                int effort = curr[0];
                int row = curr[1];
                int col = curr[2];

                // Destination mil gaya
                if (row == m - 1 && col == n - 1) {
                    return effort;
                }

                // Purana, non-optimal entry skip karein
                if (effort > dist[row][col]) {
                    continue;
                }

                for (int i = 0; i < 4; i++) {
                    int nr = row + dr[i];
                    int nc = col + dc[i];

                    if (nr >= 0 && nr < m &&
                            nc >= 0 && nc < n) {

                        int diff = Math.abs(
                                heights[row][col] - heights[nr][nc]
                        );

                        int newEffort = Math.max(effort, diff);

                        if (newEffort < dist[nr][nc]) {
                            dist[nr][nc] = newEffort;

                            pq.offer(new int[]{
                                    newEffort, nr, nc
                            });
                        }
                    }
                }
            }

            return 0;
        }
    }
}
