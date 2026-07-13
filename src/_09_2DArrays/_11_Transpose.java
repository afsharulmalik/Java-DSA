package _09_2DArrays;

public class _11_Transpose {

    // leetcode ans and ye answer saare matrix k liye shi hai

    class Solution {
        public int[][] transpose(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] ans = new int[n][m];
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    ans[j][i] = matrix[i][j];
                }
            }
            return ans;
        }
    }

    // mera hai ye wala answer aur ye answer sirf n*n matrix ke liye shi hai
    // jaise hi m and n ka value different hoga ye answer galat ho jaayega means ye bas square matrix ke liye shi hai
    public static void print(int[][] arr){
        for(int[] a: arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4},{7,2,1,3},{5,9,9,1},{3,1,8,6}};
        print(arr);
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
    }
}
