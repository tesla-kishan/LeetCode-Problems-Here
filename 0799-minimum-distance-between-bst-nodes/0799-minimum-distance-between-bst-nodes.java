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
    public int minDiffInBST(TreeNode root) {
        int []min_diff = new int [1];
        TreeNode [] prev = new TreeNode[1];
        min_diff[0] = Integer.MAX_VALUE;
        // prev[0]=null;
        inorder(root,min_diff,prev);
        return min_diff[0];
    }
    public void inorder(TreeNode root, int []min_diff,TreeNode [] prev  ){
        if(root==null) return;
        inorder(root.right,min_diff,prev);
        if(prev[0] !=null){
            int diff = Math.abs(root.val-prev[0].val);
            min_diff[0] = Math.min(min_diff[0],diff);
        }
        prev[0] = root;
        inorder(root.left,min_diff,prev);
    }
}