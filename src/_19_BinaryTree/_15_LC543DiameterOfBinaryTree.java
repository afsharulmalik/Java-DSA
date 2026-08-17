package _19_BinaryTree;

public class _15_LC543DiameterOfBinaryTree {

//      Definition for a binary tree node.
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
        static int max =0;
        public int diameterOfBinaryTree(TreeNode root) {
            max = 0;
            levels(root);
            return max;
        }
        private static int levels(TreeNode root) {
            if(root == null) return 0;
            int leftLevel = levels(root.left);
            int rightLevel = levels(root.right);
            max = Math.max(max, leftLevel + rightLevel);
            return 1+Math.max(leftLevel,rightLevel);
        }
    }
}
