package _19_BinaryTree;

public class _18_LC114FlattenBinaryTreeToLL {

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
        public void flatten(TreeNode root) {
            while(root != null){
                if(root.left == null) root = root.right;
                else {
                    TreeNode leftRight = root.left; // LST ka right most node
                    while(leftRight.right != null) leftRight = leftRight.right;
                    leftRight.right = root.right; // attached right to LST ka right
                    root.right = root.left; // LST ko right mein shift karo
                    root.left = null; // left ko null karo
                    root = root.right; // next node
                }
            }
        }
    }
}
