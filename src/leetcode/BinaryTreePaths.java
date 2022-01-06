package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryTreePaths {
    /**
     * Definition for a binary tree node.*/
     static class TreeNode {
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
        Map<Integer, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int first = 0;
        String path = "";
        public List<String> path(TreeNode root, String path){
            if(root == null) return list;
            if(root.left != null) path(root.left,  path + "->" + root.left.val);
            if(root.right != null) path(root.right, path + "->" + root.right.val);
            if(root.left == null && root.right  == null) list.add(path);
            return list;
        }
        public List<String> binaryTreePaths(TreeNode root) {
            return path(root, root.val + "");
        }


        //path = path.isEmpty() ? root.val + "" : path  + "->" + root.val;
        /*if(first == 0){
            first++;
            map.put(root.val, root.val + "");
        }
        if(root.left == null && root.right == null) {
            if(!list.contains(map.get(root.val))) list.add(map.get(root.val));
            return list;
        }
        if(root.left != null){
            map.put(root.left.val, map.getOrDefault(root.val, root.val + "") + "->" + root.left.val);
        }
        if(root.right != null){
            map.put(root.right.val, map.getOrDefault(root.val, root.val + "") + "->" + root.right.val);
        }
        if(root.left != null)
        binaryTreePaths(root.left);
        if(root.right != null)
        binaryTreePaths(root.right);
        return list;*/
        /*if(root.left != null)
        binaryTreePaths(root.left);

        if(root.right != null)
        binaryTreePaths(root.right);
        return list;*/
        //}
}
