package _19_BinaryTree;

public class _08_LC101SymmetricTree {

//     * Definition for a binary tree node.
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
        // helper function
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null) return true;
            if(p == null || q == null) return false;
            if(p.val != q.val) return false;
            if(!isSameTree(p.left, q.right)) return false; // yhaa par q.left se q.right hua hai sirf
            if(!isSameTree(p.right, q.left)) return false; // same q.right se q.left hua hai yhaa
            return true;
        }
        // this is the main question
        public boolean isSymmetric(TreeNode root) {
            if(root == null) return true;
            return isSameTree(root.left, root.right);
        }
    }
}
