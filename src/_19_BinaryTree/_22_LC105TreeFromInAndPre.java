package _19_BinaryTree;

public class _22_LC105TreeFromInAndPre {

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
        // helper function khud bnaya
        public TreeNode build(int preLow, int preHigh, int inLow, int inHigh, int[] preorder, int[] inorder){
            if(preLow > preHigh || inLow > inHigh) return null;
            int val = preorder[preLow];
            TreeNode root = new TreeNode(val);
            int idx = 0;
            for(int i=inLow; i<=inHigh; i++){ // finding root n ode in inorder
                if(inorder[i]==val){
                    idx = i;
                    break;
                }
            }
            int count = idx - inLow; // no of elements in LST
            root.left = build(preLow+1, preLow+count, inLow, idx-1, preorder, inorder );
            root.right = build(preLow+count+1, preHigh, idx+1, inHigh, preorder, inorder);
            return root;
        }
        // main function
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n = preorder.length;
            return build(0, n-1, 0, n-1, preorder, inorder);
        }
    }
}
