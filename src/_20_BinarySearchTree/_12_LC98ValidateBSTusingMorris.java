package _20_BinarySearchTree;

public class _12_LC98ValidateBSTusingMorris {

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
        public boolean isValidBST(TreeNode root){
            TreeNode curr = root;
            long prev = Long.MIN_VALUE;
            while(curr != null){
                if(curr.left != null){
                    // find predecessor : ek baar left baar baar right
                    TreeNode pred = curr.left;
                    while(pred.right != null && pred.right != curr){
                        pred = pred.right;
                    }
                    if(pred.right == null){ // linking wala concept
                        pred.right = curr;
                        curr = curr.left;
                    }else{ // pred.right == null : unlink and print
                        pred.right = null;
                        if(curr.val <= prev) return false;
                        prev = curr.val;
                        curr = curr.right;
                    }
                }else{
                    if(curr.val <= prev) return false;
                    prev = curr.val;
                    curr = curr.right;
                }
            }
            return true;
        }
    }
}
