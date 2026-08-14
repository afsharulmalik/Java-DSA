package _19_BinaryTree;
import java.util.*;
public class _06_LC226InvertBinaryTree {
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
        public TreeNode invertTree(TreeNode root) {
            if(root == null) return null;
            invertTree(root.left);
            invertTree(root.right);
            TreeNode temp = root.left; // swapping
            root.left = root.right;
            root.right = temp;
            return root;
        }
    }
}


// iss question mein hum preorder, inorder and postorder teeno tareeke se kar skteee hai
// pre means swapping phle function call baad mein
// post means swapping baad mein phle function call
// in order mein beech mein swapping hoga lekin usme ek concept hai :-  FUNCTION CALL MEIN AGAR FIRST FUNCTION INVERT(ROOT.LEFT)
// KIYA GYA HAI TOH SWAPPING K BAAD V INVERT(ROOT.LEFT) HI HOGA & ISKA REASON YE HAI K 1ST CALL LGTE HI SWAPPING HUI TOH LEFT ALREADY
// RIGHT BNN CHUKA HAI AB RIGHT KO WAPAS SE KARENGE TOH GALAT HO JAAYEGA