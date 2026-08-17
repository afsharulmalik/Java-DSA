package _19_BinaryTree;

public class _17_LC236LowestCommonAncestor {
    // Approach
//            1. null → null
//            2. root == p/q → root
//            3. left mein search
//            4. right mein search
//            5. left && right → root (LCA)
//            6. left only → left
//            7. right only → right




//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return null;
            if(root == p || root == q) return root;
            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if(left != null && right != null) return root;
            if(left !=  null) return left;
            return right;
        }
    }
}
