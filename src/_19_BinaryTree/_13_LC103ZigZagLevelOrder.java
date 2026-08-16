package _19_BinaryTree;

//Queue se current level nikalo
//          ↓
//Normal level ArrayList mein store karo
//          ↓
//Agar level odd hai
//          ↓
//Stack mein values daalo
//          ↓
//Stack se pop karke new ArrayList banao
//          ↓
//Answer mein add karo
import java.util.*;
public class _13_LC103ZigZagLevelOrder {

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
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if(root == null) return ans;
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int levelNo = 0;
            while (!q.isEmpty()){
                int n = q.size();
                List<Integer> level = new ArrayList<>();
                for(int i=0; i<n; i++){
                    TreeNode front = q.remove();
                    level.add(front.val);
                    if(front.left != null) q.add(front.left);
                    if(front.right != null) q.add(front.right);
                }
                if(levelNo %2 != 0){
//                    Stack<Integer> st = new Stack<>(); // this is used to reverse the even array index
//                    for(int val : level) st.push(val);
//                    level.clear();
//                    while (!st.isEmpty()) level.add(st.pop());
                    Collections.reverse(level);    // upar wala stack implementation karne ki jagah inbuilt ye v use kar skte hai
                }
                ans.add(level);
                levelNo++;
            }
            return ans;
        }
    }
}
