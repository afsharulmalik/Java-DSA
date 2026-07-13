package _09_2DArrays;

import java.util.Arrays;

public class _15_MatrixMultiplication {

        public static int[][] multiply(int[][] A, int[][] B) {

            int m = A.length;
            int n = A[0].length;
            int p = B[0].length;

            int[][] ans = new int[m][p];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < p; j++) {
                    for (int k = 0; k < n; k++) {
                        ans[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            return ans;
        }

        public static void main(String[] args) {

            int[][] A = {
                    {1, 2},
                    {3, 4}
            };

            int[][] B = {
                    {5, 6},
                    {7, 8}
            };

            int[][] result = multiply(A, B);

            for (int[] row : result) {
                System.out.println(Arrays.toString(row));
            }
        }
    }
