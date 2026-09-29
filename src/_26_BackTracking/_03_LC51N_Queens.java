package _26_BackTracking;
import java.util.*;
public class _03_LC51N_Queens {

/*solve(row)
    ↓
row == n ?
    ↓ Yes
ans mein board add
    ↓ No
har column try
    ↓
isSafe() ?
   /    \
 No      Yes
 |        |
skip      Q place
           ↓
       solve(row + 1)
           ↓
       Q remove
           ↓
       next column
       */

    class Solution {
        List<List<String>> ans = new ArrayList<>(); // declaring globally
        int n;

        // teeno check karega ye
        private boolean isSafe(int row, int col, char[][] chessBoard) {
            // check col
            int r = row-1;
            while(r>=0){
                if(chessBoard[r][col]=='Q') return false;
                r--;
            }
            // check left diagonal
            r = row-1;
            int c = col-1;
            while(r>=0 && c>=0){
                if(chessBoard[r][c]=='Q') return false;
                r--;
                c--;
            }
            // check right diagonal
            r = row-1;
            c = col+1;
            while(r>=0 && c<n){
                if(chessBoard[r][c]=='Q') return false;
                r--;
                c++;
            }
            return true;
        }
        // solve function
        private void solve(int row, char[][] chessBoard) {
            if(row == n){ // a valid ans
                List<String> list = new ArrayList<>();
                for(int i=0; i<n; i++){
                    list.add(new String(chessBoard[i]));
                }
                ans.add(list);
                return;
            }
            // try every col
            for(int col=0; col<n; col++){
                if(isSafe(row,col,chessBoard)){
                    chessBoard[row][col] = 'Q'; // mark karenge valid place
                    solve(row+1,chessBoard); // move to next row
                    chessBoard[row][col] = '.';
                }
            }
        }


        // main function
        public List<List<String>> solveNQueens(int n) {
            this.n = n;  // declared globally
            char[][] chessBoard = new char[n][n];
            for(int i=0; i<n; i++) Arrays.fill(chessBoard[i],'.');
            solve(0,chessBoard);
            return ans;
        }
    }
}
