package _28_StriverGraphs;
import java.util.*;
public class _05_LC200NoOfIslands {
    class Solution {
        class Pair{ // pair class bnn gya hai
            int row;
            int col;
            Pair(int row, int col){
                this.row = row;
                this.col = col;
            }
        }
        // helper function
        public void bfs(int row, int col, char[][] grid, boolean[][] visited){
            int m = grid.length;
            int n = grid[0].length;
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(row,col));
            while(!q.isEmpty()){
                Pair front = q.remove();
                int newRow = front.row;
                int newCol = front.col;
                // saare direction ko check karna hai ab
                // up
                if(newRow>0){
                    if(!visited[newRow-1][newCol] && grid[newRow-1][newCol]=='1'){
                        q.add(new Pair(newRow-1,newCol));
                        visited[newRow-1][newCol]=true;
                    }
                }
                // right
                if((newCol+1)<n){
                    if(!visited[newRow][newCol+1] && grid[newRow][newCol+1]=='1'){
                        q.add(new Pair(newRow,newCol+1));
                        visited[newRow][newCol+1]=true;
                    }
                }
                // down
                if(newRow+1<m){
                    if(!visited[newRow+1][newCol] && grid[newRow+1][newCol]=='1'){
                        q.add(new Pair(newRow+1,newCol));
                        visited[newRow+1][newCol]=true;
                    }
                }
                // up
                if((newCol)>0){
                    if(!visited[newRow][newCol-1] && grid[newRow][newCol-1]=='1'){
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
            boolean[][] visited = new boolean[m][n];
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
    class DFSSolution {
        private void dfs(int row, int col, char[][] grid, boolean[][] visited){
            int m = grid.length;
            int n = grid[0].length;
            visited[row][col]=true;
            if(row-1>=0 && grid[row-1][col]=='1' && !visited[row-1][col]) // visited[row-1][col]==false
                dfs(row-1,col,grid,visited);
            if(row+1<=m-1 && grid[row+1][col]=='1' && !visited[row+1][col])
                dfs(row+1,col,grid,visited);
            if(col-1>=0 && grid[row][col-1]=='1' && !visited[row][col-1])
                dfs(row,col-1,grid,visited);
            if(col+1<=n-1 && grid[row][col+1]=='1' && !visited[row][col+1])
                dfs(row,col+1,grid,visited);
        }
        public int numIslands(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int count = 0;
            boolean[][] visited = new boolean[m][n];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(grid[i][j]=='1' && !visited[i][j]){
                        dfs(i,j,grid,visited);
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
