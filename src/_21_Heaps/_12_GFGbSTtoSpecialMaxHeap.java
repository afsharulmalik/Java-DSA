package _21_Heaps;
import java.util.ArrayList;
public class _12_GFGbSTtoSpecialMaxHeap {
//     Binary Tree Node Structure
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

// this is inorder and postorder wala solution
    class Solution {
        static int idx;
        // helper function
        private static void inorder(Node root, ArrayList<Integer> ans){
            if(root == null) return;
            inorder(root.left,ans);
            ans.add(root.data);
            inorder(root.right,ans);
        }
        private static void postorder(Node root, ArrayList<Integer> ans){
            if(root == null) return;
            postorder(root.left,ans);
            postorder(root.right,ans);
            root.data = ans.get(idx++);
        }
        public static void convertToMaxHeap(Node root) {
            idx = 0;
            ArrayList<Integer> ans = new ArrayList<>();
            inorder(root,ans);
            postorder(root,ans);
        }
    }
}
