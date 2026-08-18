package _19_BinaryTree;

public class _24_LC1008BSTFromPreorder {
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
        private int idx = 0;
        private TreeNode build(int[] preorder, int maxValue) {
            if(idx >= preorder.length || preorder[idx] > maxValue) return null;
            TreeNode root = new TreeNode(preorder[idx]);
            idx++;
            root.left = build(preorder, root.val);
            root.right = build(preorder, maxValue);
            return root;
        }
        public TreeNode bstFromPreorder(int[] preorder) {
            if(preorder == null || preorder.length == 0) return null;
            return build(preorder, Integer.MAX_VALUE);
        }
    }
}
