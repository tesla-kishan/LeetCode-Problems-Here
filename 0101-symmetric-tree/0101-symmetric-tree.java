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
    public boolean fn(TreeNode p , TreeNode q){
        if(p==null && q==null) return true;
        if(p==null && q != null) return false;
        if(p!=null && q == null) return false;
        if(p.val != q.val) return false;
        boolean ans1 = fn(p.left,q.right);
        boolean ans2 = fn(p.right,q.left);
        return ans1 && ans2;
    }
}