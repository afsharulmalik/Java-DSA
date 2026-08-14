package _19_BinaryTree;

public class _01_Implementation {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

    // preorder
    private static void display(Node root) {
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    // size of tree
    private static int size(Node root) {
        if(root == null) return 0;
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return 1+leftSize+rightSize;
    }
    // sum of tree
    private static int sum(Node root) {
        if(root == null) return 0;
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return root.val+leftSum+rightSum;
    }
    //product
    private static int product(Node root) {
        if(root == null) return 1;
        int leftProduct = product(root.left);
        int rightProduct = product(root.right);
        return root.val*leftProduct*rightProduct;
    }
    // Maximum value
    private static int maximum(Node root) {
        if(root == null) return 0;
        int leftMax = maximum(root.left);
        int rightMax = maximum(root.right);
        return Math.max(root.val, Math.max(leftMax,rightMax));
    }
    // Minimum value
    private static int minimum(Node root) {
        if(root == null) return 0;
        int leftMin = minimum(root.left);
        int rightMin = minimum(root.right);
        return Math.min(root.val, Math.min(leftMin, rightMin));
    }
    // levels
    private static int levels(Node root) {
        if(root == null) return 0;
        int leftLevel = levels(root.left);
        int rightLevel = levels(root.right);
        return 1+Math.max(leftLevel,rightLevel);
    }

    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(2);
        Node c = new Node(13);
        Node d = new Node(-4);
        Node e = new Node(115);
        Node f = new Node(6);
        Node g = new Node(79);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        /*
        output
                       a
                      / \
                     b   c
                    /\   /\
                   d  e f  g
         */
        // ye preorder traversal hai
        display(a);
        System.out.println();
        // size of the tree
        System.out.println(size(a));
        // sum of the values
        System.out.println(sum(a));
        // product of values
        System.out.println(product(a));
        // Maximum value of binary tree
        System.out.println(maximum(a));
        // Minimum value of binary tree
        System.out.println(minimum(a));
        System.out.println(levels(a));
    }
}
