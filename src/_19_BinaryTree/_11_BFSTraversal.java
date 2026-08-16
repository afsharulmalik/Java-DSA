package _19_BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class _11_BFSTraversal {
    // this pair class is for level order line wise function
    static class Pair{
        Node node;
        int level;
        Pair(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    private static void levelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node front = q.remove();
            System.out.print(front.val+" ");
            if(front.left!=null) q.add(front.left);
            if(front.right!=null) q.add(front.right);
        }
        System.out.println();
    }
    private static void levelOrderLineWise(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 0;
        q.add(new Pair(root, 0));
        while (!q.isEmpty()){
            Pair front = q.remove();
            if(front.level != currLevel){
                currLevel++;
                System.out.println();
            }
            System.out.print(front.node.val+" ");
            if(front.node.left != null)
                q.add(new Pair(front.node.left, front.level + 1));

            if(front.node.right != null)
                q.add(new Pair(front.node.right, front.level + 1));
        }
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
//        levelOrder(a);
        levelOrderLineWise(a);
    }
}
