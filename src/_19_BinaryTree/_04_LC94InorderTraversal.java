package _19_BinaryTree;
import java.util.*;
public class _04_LC94InorderTraversal {

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
        // helper function
        public void dfs(TreeNode root, List<Integer>ans){
            if(root == null) return;
            dfs(root.left, ans);
            ans.add(root.val);
            dfs(root.right, ans);
        }
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            dfs(root, ans);
            return ans;
        }
    }
}
