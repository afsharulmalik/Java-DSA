package _16_LinkedList;

import java.util.Arrays;

public class _18_LC2326SpiralMatrixIV {


//     Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public int[][] spiralMatrix(int m, int n, ListNode head) {
            int[][] matrix = new int[m][n];
            // Fill matrix with -1
            for (int[] row : matrix) {
                Arrays.fill(row, -1);
            }
            // Directions: Right, Down, Left, Up
            int[] dr = {0, 1, 0, -1};
            int[] dc = {1, 0, -1, 0};
            int row = 0;
            int col = 0;
            int dir = 0;  // right se start hai
            while (head != null) {
                // Fill current cell
                matrix[row][col] = head.val;
                head = head.next;
                // Calculate next position
                int newRow = row + dr[dir];
                int newCol = col + dc[dir];
                // Check boundary or visited cell
                if (newRow < 0 || newRow >= m ||
                        newCol < 0 || newCol >= n ||
                        matrix[newRow][newCol] != -1) {
                    // Change direction
                    dir = (dir + 1) % 4;
                    // Recalculate next position
                    newRow = row + dr[dir];
                    newCol = col + dc[dir];
                }
                // Move
                row = newRow;
                col = newCol;
            }
            return matrix;
        }
    }

    //  alternate solution of same problem
    class AlternateSolution {
        public int[][] spiralMatrix(int m, int n, ListNode head) {

            int[][] matrix = new int[m][n];

            // Fill matrix with -1
            for (int[] row : matrix) {
                Arrays.fill(row, -1);
            }

            int top = 0;
            int bottom = m - 1;
            int left = 0;
            int right = n - 1;

            while (top <= bottom && left <= right && head != null) {

                // Right
                for (int i = left; i <= right && head != null; i++) {
                    matrix[top][i] = head.val;
                    head = head.next;
                }
                top++;

                // Down
                for (int i = top; i <= bottom && head != null; i++) {
                    matrix[i][right] = head.val;
                    head = head.next;
                }
                right--;

                // Left
                if (top <= bottom) {
                    for (int i = right; i >= left && head != null; i--) {
                        matrix[bottom][i] = head.val;
                        head = head.next;
                    }
                    bottom--;
                }

                // Up
                if (left <= right) {
                    for (int i = bottom; i >= top && head != null; i--) {
                        matrix[i][left] = head.val;
                        head = head.next;
                    }
                    left++;
                }
            }

            return matrix;
        }
    }
    public static void main(String[] args) {

    }
}
