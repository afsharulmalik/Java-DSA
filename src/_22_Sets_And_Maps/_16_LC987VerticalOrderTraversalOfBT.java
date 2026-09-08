package _22_Sets_And_Maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _16_LC987VerticalOrderTraversalOfBT {
//     Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
          class Pair {
              int row;
              int col;
              int val;
              Pair(int row, int col, int val){
                  this.row = row;
                  this.col = col;
                  this.val = val;
              }
          }
          // helper function for dfs traversal
        private void dfs(TreeNode root, int row, int col, List<Pair> list) {
              if(root == null) return;
              list.add(new Pair(row,col, root.val)); // current node ka info
              dfs(root.left,row+1, col-1, list); // left subtree
              dfs(root.right, row+1, col+1, list); // right subtree
        }
        // main function
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            List<Pair> list = new ArrayList<>();
            dfs(root,0,0,list);

            // sorting ho rha hai using custom comparator
            Collections.sort(list, (a, b) -> {
                if(a.col != b.col)
                    return a.col - b.col;
                if(a.row != b.row)
                    return a.row - b.row;
                return a.val - b.val;
            });

            // final answer using list
            List<List<Integer>> ans = new ArrayList<>();
            int prevCol = Integer.MIN_VALUE;
            for (Pair p : list) {
                // New column
                if (p.col != prevCol) {
                    ans.add(new ArrayList<>());
                    prevCol = p.col;
                }
                ans.get(ans.size() - 1).add(p.val);
            }
            return ans;
        }
    }
}
