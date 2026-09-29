package _26_BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class _02_RatInAMazeObstacles {
    private void helper(int row, int col, int endRow, int endCol, boolean[][] visited, String s, int[][] maze, ArrayList<String> ans) {
        if(row>endRow || col>endCol || row<0 || col<0 || maze[row][col]==0 || visited[row][col]) return;
        visited[row][col] = true;
        if(row == endRow && col == endCol){
            ans.add(s);
            visited[row][col]= false;
            return;
        }
        helper(row,col-1, endRow, endCol, visited,s+'L',maze,ans);
        helper(row-1, col, endRow, endCol, visited, s+'U',maze,ans);
        helper(row,col+1,endRow, endCol, visited,s+'R',maze,ans);
        helper(row+1, col, endRow, endCol, visited, s+'D',maze,ans);
        visited[row][col] = false; // backtracking
    }
    public ArrayList<String> ratInMaze(int[][] maze){
        ArrayList<String> ans= new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        helper(0,0,n-1,n-1, visited,"",maze,ans);
        return ans;
    }

    public static void main(String[] args) {

    }
}
