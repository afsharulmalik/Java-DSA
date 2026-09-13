package _23_BitManipulation;

public class _17_LC861ScoreAfterFlippingMatrix {
    class Solution {
        public int matrixScore(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            // 0th col of matrix should have all once
            for(int i =0; i<m; i++){
                if(grid[i][0]==0){ // flip that row
                    for(int j =0; j<n; j++){
                        // grid[i][j] ^= 1;  //  flip ho rha hai
                        grid[i][j] = 1 - grid[i][j];  // flip hi kar rha hai ye v
                    }
                }
            }
            // har us col ko flip karo jisme no of 0 > no of 1
            for(int j =0; j<n; j++){
                int zeros =0;
                int ones = 0;
                for(int i =0; i<m; i++){
                    if(grid[i][j]==0) zeros++;
                    else ones++;
                }
                if(zeros>ones){ // col ko flip kar denge
                    for(int i=0; i<m; i++){
                        grid[i][j] ^= 1;
                    }
                }
            }
            int sum =0;
            int pow =1;
            for(int j=n-1; j>=0; j--){
                int ones = 0;
                for(int i=0; i<m; i++){
                    if(grid[i][j]==1) ones++;
                }
                sum+=pow*ones;
                pow*=2;
            }
            return sum;
        }
    }
}
