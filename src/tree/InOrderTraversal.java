package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
        List<Integer> values = new ArrayList<>();

        public void inorderTraversal(TreeNode root) {

            //inorderTraversalRecursively(root, values);
            iterativeInOrderTraversal(root, values);
        }
        public void iterativeInOrderTraversal(TreeNode root, List<Integer> values){
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            //TreeNode curr = root;
            while (root != null || !stack.isEmpty()) {
                while (root != null) {
                    stack.push(root);
                    root = root.left;
                }
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        public void inorderTraversalRecursively(TreeNode root, List<Integer> values){

            if(root == null){
                System.out.println(root);
                return;
            }
            System.out.println(root.val);
            inorderTraversalRecursively(root.left, values);
            values.add(root.val);
            inorderTraversalRecursively(root.right, values);

        }

    public static void main(String[] args) {
        InOrderTraversal inOrderTraversal = new InOrderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        root.right.right = null;
        inOrderTraversal.inorderTraversal(root);
        for(Integer value:inOrderTraversal.values){
            //System.out.println(value);
        }
    }
}


  //Definition for a binary tree node.
  class TreeNode {
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
