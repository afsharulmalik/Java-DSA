package Tree;

public class implementation {
    public static class Node {
        int val; // 0
        Node left; // null
        Node right; // null

        public Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
//        root.val = 1;
        System.out.println(root.val);
    }
}
