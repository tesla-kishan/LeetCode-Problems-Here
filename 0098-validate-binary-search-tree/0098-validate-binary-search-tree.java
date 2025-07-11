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
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        TreeNode arr[] = new TreeNode [1];
        boolean flag[] = new boolean [1];
        flag[0]=true;
        inorder(root,flag,arr);
        return flag[0];
    }
    public void inorder(TreeNode root,boolean flag[],TreeNode arr[]){
        if(root==null) return;
        inorder(root.left,flag,arr);
        if(arr[0]==null) arr[0]=root;
        else if(root.val<=arr[0].val) flag[0]=false;
        else arr[0]=root;
        inorder(root.right,flag,arr);
    }
}