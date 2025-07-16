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
    static int min_diff = Integer.MAX_VALUE;
    static TreeNode prev = null;
    public int minDiffInBST(TreeNode root) {
        min_diff = Integer.MAX_VALUE;
        prev = null;
        inorder(root);
        return min_diff;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.right);
        if(prev !=null){
            int diff = Math.abs(root.val-prev.val);
            min_diff = Math.min(min_diff,diff);
        }
        prev = root;
        inorder(root.left);
    }
}