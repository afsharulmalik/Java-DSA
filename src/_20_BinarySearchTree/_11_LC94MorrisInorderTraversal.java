package _20_BinarySearchTree;
import java.util.*;

public class _11_LC94MorrisInorderTraversal {
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

    // Morris Inorder Traversal
    class Solution{
        public List<Integer> inorderTraversal(TreeNode root){
            List<Integer> ans = new ArrayList<>();
            TreeNode curr = root;
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
                        ans.add(curr.val);
                        curr = curr.right;
                    }
                }else{
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            return ans;
        }
    }
}
