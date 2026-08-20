package _20_BinarySearchTree;

public class _09_GFGCheckForBSTLC98 {
//     Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

    class Solution {
        // helper funcion
        public boolean isValid(Node root, long min, long max){
            if(root == null) return true;
            if(root.data <= min || root.data >= max) return false;
            boolean left = isValid(root.left, min, root.data);
            boolean right = isValid(root.right, root.data, max);
            return left && right;
        }
        public boolean isBST(Node root) {
            return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }
    }
}
