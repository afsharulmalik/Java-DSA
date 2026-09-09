package _22_Sets_And_Maps;

import java.util.*;

public class _18_LC2385BurningTree {
//    Definition for a binary tree node.
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
          static class Pair{
              TreeNode node;
              int dist;
              Pair(TreeNode node, int dist){
                  this.node = node;
                  this.dist = dist;
              }
          }
          static TreeNode curr; // global variable
          static HashMap<TreeNode, TreeNode> parent; // global variable
          // main function
          public int amountOfTime(TreeNode root, int start) {
              curr = null;
              parent = new HashMap<>();
              dfs(root, start);
              Queue<Pair> q = new LinkedList<>();
              q.add(new Pair(curr,0));
              HashSet<TreeNode> burned = new HashSet<>();
              burned.add(curr);
              int time = 0;
              while(!q.isEmpty()){  // bfs hai ye
                  Pair front = q.remove();
                  // iska left, right, parent wapas se queue mein dalna hai ek level jyada k saath
                  int dist = front.dist;
                  time = Math.max(time, dist);
                  TreeNode node = front.node;
                  if(node.left != null && !burned.contains(node.left)){
                      q.add(new Pair(node.left, dist+1));
                      burned.add(node.left);
                  }
                  if(node.right != null && !burned.contains(node.right)){
                      q.add(new Pair(node.right, dist+1));
                      burned.add(node.right);
                  }
                  if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                      q.add(new Pair(parent.get(node), dist+1));
                      burned.add(parent.get(node));
                  }
              }
              return time;
          }

        private void dfs(TreeNode root, int start) {
              if(root == null) return;
              if(root.val == start) curr = root;
              if(root.left != null) parent.put(root.left, root);
              if(root.right != null) parent.put(root.right, root);
              dfs(root.left, start);
              dfs(root.right, start);
        }
    }
}
