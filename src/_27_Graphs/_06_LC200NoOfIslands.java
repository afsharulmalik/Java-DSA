package _27_Graphs;

import java.util.*;

public class _06_LC200NoOfIslands {
    class Solution {
        class Pair{
            int row;
            int col;
            Pair(int row, int col){
                this.row=row;
                this.col=col;
            }
        }
        private void bfs(int row, int col, char[][] grid, boolean[][] visited) {
            int m = grid.length;
            int n = grid[0].length;
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(row,col));
            while(!q.isEmpty()){
                Pair front = q.remove();
                int newRow = front.row;
                int newCol = front.col;
                // all direction mein check karenge
                // start hamesha index[0][0] se hoga
                // up : row-1, col
                if((newRow)>0){
                    if(visited[newRow-1][newCol]==false && grid[newRow -1][newCol]=='1'){
                        q.add(new Pair(newRow-1,newCol));
                        visited[newRow-1][newCol]=true;
                    }
                }
                // right : row, col+1
                if((newCol+1)<n){
                    if(visited[newRow][newCol+1]==false && grid[newRow][newCol+1]=='1'){
                        q.add(new Pair(newRow,newCol+1));
                        visited[newRow][newCol+1]=true;
                    }
                }
                //down : row+1, col
                if((newRow+1)<m){
                    if(visited[newRow+1][newCol]==false && grid[newRow+1][newCol]=='1'){
                        q.add(new Pair(newRow+1,newCol));
                        visited[newRow+1][newCol]=true;
                    }
                }
                // left : row, col-1
                if((newCol)>0){
                    if(visited[newRow][newCol-1]==false && grid[newRow][newCol-1]=='1'){
                        q.add(new Pair(newRow,newCol-1));
                        visited[newRow][newCol-1]=true;
                    }
                }
            }
        }
        public int numIslands(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            boolean[][] visited = new boolean[m][n]; // by default false hai
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(grid[i][j]=='1' && !visited[i][j]){
                        bfs(i,j,grid,visited);
                        count++;
                    }
                }
            }
            return count;
        }
    }
}




// more optimized solution
class Solution {
    class Pair {
        int row, col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    private void bfs(int row, int col, char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // Up, Right, Down, Left
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row, col));

        // Mark visited by changing land to water
        grid[row][col] = '0';

        while (!q.isEmpty()) {
            Pair front = q.remove();

            int currRow = front.row;
            int currCol = front.col;

            for (int i = 0; i < 4; i++) {
                int newRow = currRow + dr[i];
                int newCol = currCol + dc[i];

                if (newRow >= 0 && newRow < m &&
                        newCol >= 0 && newCol < n &&
                        grid[newRow][newCol] == '1') {

                    q.add(new Pair(newRow, newCol));

                    // Mark when enqueuing
                    grid[newRow][newCol] = '0';
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    bfs(i, j, grid);
                    count++;
                }
            }
        }

        return count;
    }
}

