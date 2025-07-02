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
    public boolean isSymmetric(TreeNode root) {
        return fn(root.left,root.right);
    }
    public boolean fn(TreeNode x, TreeNode y){
        if(x==null || y==null) return x==y;
        if(x.val != y.val) return false;
        boolean ans1 = fn(x.left,y.right);
        boolean ans2 = fn(x.right,y.left);
        return ans1 && ans2;
    }

}