package _26_BackTracking;

public class _01_RatInAMaze4Direction {
    private static int helper(int row, int col, int endRow, int endCol, boolean[][] visited, String s) {
        if(row>endRow || col >endCol || row<0 || col<0 || visited[row][col]) return 0;
        visited[row][col] = true;
        if(row == endRow && col == endCol){
            System.out.println(s);
            visited[row][col] = false; // backtracking
            return -1;
        }
        int left = helper(row,col-1, endRow, endCol, visited,s+'L');
        int up = helper(row-1, col, endRow, endCol, visited, s+'U');
        int right = helper(row,col+1,endRow, endCol, visited,s+'R');
        int down = helper(row+1, col, endRow, endCol, visited, s+'D');
        visited[row][col] = false; // backtracking
        return right + down + up + left;
    }
    public static void main(String[] args) {
        // left Up Right down
        int m =3;
        int n =3;
        boolean[][] visited = new boolean[m][n];
        System.out.println(helper(0,0,m-1,n-1,visited,""));
    }


    // gfg solution  :       https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1
//    class Solution {
//
//        private static void helper(int row, int col, int endRow, int endCol,
//                                   boolean[][] visited, int[][] maze,
//                                   String s, ArrayList<String> ans) {
//
//            if (row < 0 || col < 0 || row > endRow || col > endCol
//                    || visited[row][col] || maze[row][col] == 0) {
//                return;
//            }
//
//            visited[row][col] = true;
//
//            if (row == endRow && col == endCol) {
//                ans.add(s);
//                visited[row][col] = false;
//                return;
//            }
//
//            helper(row, col - 1, endRow, endCol, visited, maze, s + 'L', ans);
//            helper(row - 1, col, endRow, endCol, visited, maze, s + 'U', ans);
//            helper(row, col + 1, endRow, endCol, visited, maze, s + 'R', ans);
//            helper(row + 1, col, endRow, endCol, visited, maze, s + 'D', ans);
//
//            visited[row][col] = false;
//        }
//
//        public ArrayList<String> ratInMaze(int[][] maze) {
//
//            ArrayList<String> ans = new ArrayList<>();
//            int n = maze.length;
//
//            boolean[][] visited = new boolean[n][n];
//
//            if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
//                return ans;
//            }
//
//            helper(0, 0, n - 1, n - 1, visited, maze, "", ans);
//
//            Collections.sort(ans);
//
//            return ans;
//        }
//    }
}
