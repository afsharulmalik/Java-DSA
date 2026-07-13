package _09_2dArrays;

public class _18_Leetcode240 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int i=0;
            int j=n-1;
            while(j>=0 && i<m){
                if(matrix[i][j]>target) j--;
                else if(matrix[i][j]<target) i++;
                else return true;
            }
            return false;
        }
    }
}
