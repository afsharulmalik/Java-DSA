package _21_Heaps;
import java.util.*;
public class _11_LC958CheckCompletenessOfBT {
//
//                root
//                 |
//               size()
//                 |
//              total nodes
//                 |
//               isCBT()
//                 |
//          index each node
//                 |
//            index > size ?
//            /          \
//    YES            NO
//       ❌             continue

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
        // Count total nodes
        int size(TreeNode root) {
            if (root == null) return 0;
            return 1 + size(root.left) + size(root.right);
        }
        // Check Complete Binary Tree using indexing
        private boolean isCBT(TreeNode root, long i, int s) {
            if (root == null) return true;
            if (i > s) return false;
            return isCBT(root.left, 2 * i, s)
                    && isCBT(root.right, 2 * i + 1, s);
        }
        // Main function
        public boolean isCompleteTree(TreeNode root) {
            int s = size(root);
            return isCBT(root, 1, s);
        }
    }
}
