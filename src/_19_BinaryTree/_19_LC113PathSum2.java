package _19_BinaryTree;
import java.util.*;
public class _19_LC113PathSum2 {

    // Question meaning
//    Humein ek binary tree diya hai aur ek targetSum.
//    Humein saare root → leaf paths find karne hain jinka sum targetSum ke equal ho

//    add → explore → remove → add → explore → remove

//    1. DFS
//    2. path
//    3. remainingSum
//    4. backtracking


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
        private void dfs(TreeNode root, int remainingSum, List<Integer> path, List<List<Integer>> result){
            if(root == null) return;
            path.add(root.val); // current node ko path mein add karo
            remainingSum -= root.val; // updating remaining sum
            if(root.left == null && root.right == null){ // leaf and remaining sum = 0 check
                if(remainingSum == 0) result.add(new ArrayList<>(path));
            }
            dfs(root.left, remainingSum, path, result); // left explore
            dfs(root.right, remainingSum, path, result); // right explore
            path.remove(path.size()-1); // backtracking kaam
        }
        // main function
        public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
            List<List<Integer>> result = new ArrayList<>();
            List<Integer> path = new ArrayList<>();
            dfs(root, targetSum, path, result);
            return result;
        }
    }
}
