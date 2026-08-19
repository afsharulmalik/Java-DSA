package _20_BinarySearchTree;

public class _04_LC701InsertIntoBST {

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
        public TreeNode insertIntoBST(TreeNode root, int val) {
            TreeNode temp = new TreeNode(val);
            if(root == null) return temp; // root nahi hai
            if(root.val > val) root.left = insertIntoBST(root.left, val); // left jao
            else root.right =  insertIntoBST(root.right, val); // right jao
            return root; // already exist krta hai
        }
    }

/// root.left and root.right se initialize karne ka mtlb hai humne left par attach kiya hai ya right par
}
