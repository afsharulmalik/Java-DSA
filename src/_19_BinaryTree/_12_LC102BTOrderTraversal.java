package _19_BinaryTree;
import java.util.*;
public class _12_LC102BTOrderTraversal {

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
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if(root == null) return ans;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()) {
                int n = q.size(); // main trick isi se nodes seperate ho rhe hai
                List<Integer> level = new ArrayList<>();
                for(int i = 0; i < n; i++) {
                    TreeNode front = q.remove();
                    level.add(front.val);
                    if(front.left != null) q.add(front.left);
                    if(front.right != null) q.add(front.right);
                }
                ans.add(level);
            }
            return ans;
        }
    }
}
