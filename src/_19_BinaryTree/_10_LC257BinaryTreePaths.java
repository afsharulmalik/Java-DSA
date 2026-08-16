package _19_BinaryTree;
import java.util.*;
public class _10_LC257BinaryTreePaths {

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
        public void helper(TreeNode root, String path, List<String>ans){
            if(root == null) return; // base case
            path += root.val; // current node to path
            if(root.left == null && root.right == null){ // if leaf node
                ans.add(path);
                return;
            }
            helper(root.left, path + "->",ans);
            helper(root.right, path + "->",ans);
        }
        // main function
        public List<String> binaryTreePaths(TreeNode root) {
            List<String> ans = new ArrayList<>();
            helper(root, "", ans);
            return ans;
        }
    }
}
