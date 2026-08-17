package _19_BinaryTree;
import java.util.*;
public class _21_GFGTreeBoundaryTraversal {
//     Node Structure
class Node {
    int data;
    Node left, right;
    Node(int val) {
        data = val;
        left = right = null;
    }
}

    class Solution {
        private void leftBoundary(Node root, ArrayList<Integer> ans) {
            Node curr = root.left;
            while(curr != null) {
                if(curr.left != null || curr.right != null) ans.add(curr.data);
                if(curr.left != null) curr = curr.left;
                else curr = curr.right;
            }
        }

        private void leafNodes(Node root, ArrayList<Integer> ans) {
            if(root == null) return;
            // Leaf = NO left AND NO right child
            if(root.left == null && root.right == null) {
                ans.add(root.data);
                return;
            }
            leafNodes(root.left, ans);
            leafNodes(root.right, ans);
        }

        private void rightBoundary(Node root, ArrayList<Integer> ans) {
            Node curr = root.right;
            ArrayList<Integer> temp = new ArrayList<>();
            while(curr != null) {
                if(curr.left != null || curr.right != null) temp.add(curr.data);
                if(curr.right != null) curr = curr.right;
                else curr = curr.left;
            }
            Collections.reverse(temp);
            ans.addAll(temp);
        }

        public ArrayList<Integer> boundaryTraversal(Node root) {
            ArrayList<Integer> ans = new ArrayList<>();
            if(root == null) return ans;
            // Root is not a leaf
            if(root.left != null || root.right != null) ans.add(root.data);
            leftBoundary(root, ans);
            leafNodes(root, ans);
            rightBoundary(root, ans);
            return ans;
        }
    }
}
