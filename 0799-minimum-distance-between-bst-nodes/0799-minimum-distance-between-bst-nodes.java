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
    static TreeNode prev = null;
    public int minDiffInBST(TreeNode root) {
        int []min_diff = new int [1];
        min_diff[0] = Integer.MAX_VALUE;
        prev = null;
        inorder(root,min_diff);
        return min_diff[0];
    }
    public void inorder(TreeNode root, int []min_diff ){
        if(root==null) return;
        inorder(root.right,min_diff);
        if(prev !=null){
            int diff = Math.abs(root.val-prev.val);
            min_diff[0] = Math.min(min_diff[0],diff);
        }
        prev = root;
        inorder(root.left,min_diff);
    }
}