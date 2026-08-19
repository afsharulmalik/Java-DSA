package _20_BinarySearchTree;

public class _01_GFGMinimumInBST {

//Definition for Node
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}


    class Solution {
        public int minValue(Node root) {
            Node temp = root;
            while(temp.left != null) temp = temp.left;
            return temp.data;
        }
        public int maxValue(Node root){
            Node temp = root;
            while(temp.right != null) temp = temp.right;
            return temp.data;
        }
    }
}
