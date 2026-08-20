package _20_BinarySearchTree;

import _19_BinaryTree._20_LC98ValidateBST;

public class _10_LC1373MaximumSumBSTinBT {

//    /      Definition for a binary tree node.
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
        int ans = 0; // global variable
        class Info { // user defined data type
            boolean isBST;
            int min;
            int max;
            int sum;
            Info(boolean isBST, int min, int max, int sum){
                this.isBST = isBST;
                this.min = min;
                this.max = max;
                this.sum = sum;
            }
        }
        private Info postorder(TreeNode root){ // helper function
            if(root == null){
                return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
            }
            Info left = postorder(root.left); // left sub tree
            Info right = postorder(root.right); // right sub tree
            if(left.isBST && right.isBST && left.max < root.val && root.val < right.min){ // subtree is bst ?
                int sum = left.sum + root.val + right.sum;
                ans = Math.max(ans, sum);
                int min = Math.min(root.val, left.min);
                int max = Math.max(root.val, right.max);
                return new Info(true, max, min, sum);
            }
            return new Info(false, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
        // main function
        public int maxSumBST(TreeNode root) {
            postorder(root);
            return ans;
        }
    }
}
