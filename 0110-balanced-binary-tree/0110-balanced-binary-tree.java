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
    boolean valid = true;
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        fn(root);
        return valid;
    }
    public int fn(TreeNode root){
        if(root == null) return 0;
        int left = fn(root.left);
        int right = fn(root.right);
        if(Math.abs(left-right)>1) {
            valid = false;
        }
        return Math.max(left,right)+1;
    }
}