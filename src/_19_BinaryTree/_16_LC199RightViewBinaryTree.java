package _19_BinaryTree;
import java.util.*;
public class _16_LC199RightViewBinaryTree {

    // SOLVE USING THIS APPROACH :-
            //    1. root ko queue mein daalo.
            //    2. Jab tak queue empty nahi hai:
            //    a. current level ka size nikalo.
            //    b. us level ke saare nodes process karo.
            //    c. level ke LAST node ko answer mein add karo.
            //    d. left aur right children ko queue mein daalo.
            //            3. answer return karo.

 /*
    class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                // current level ka last node
                if (i == size - 1) ans.add(node.val);
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
        }
        return ans;
    }
}
     */

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


      // submitted this solution leetcode
    class Solution {
        // helper function
        public void view(TreeNode root, int level, List<Integer> ans){
            if(root == null) return;
            if(level >= ans.size()) ans.add(root.val);
            else ans.set(level, root.val);
            view(root.left, level+1, ans);
            view(root.right, level+1, ans);
        }
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            view(root, 0, ans); // root level and
            return ans;
        }
    }
}
