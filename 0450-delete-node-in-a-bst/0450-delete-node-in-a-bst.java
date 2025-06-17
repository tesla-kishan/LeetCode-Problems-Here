/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        else{
            // 1. search the key in bst
            if(key<root.val) root.left = deleteNode(root.left,key);
            else if(key>root.val) root.right = deleteNode(root.right,key);
            else{
                // 2. delete the key
                // 1 children wala ... leaf node automatically handle
                if(root.left == null) return root.right;
                else if (root.right == null) return root.left;
                else{
                    //node -> 2 children
                    // root.val = findmax(root.left);
                    // root.right = deleteNode(root.left,root.data);
                    root.val = findmin(root.right);
                    root.right = deleteNode(root.right,root.val);
                }
            }
        }
        return root;
    }
    private int findmin(TreeNode root){
        TreeNode temp = root;
        int min = root.val;
        while(temp.left != null){
            temp = temp.left;
            min = temp.val;
        }
        return min;
    }
}