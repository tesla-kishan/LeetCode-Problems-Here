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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        TreeNode root = helper(preorder,0,n-1,inorder,0,n-1);
        return root;
    }
    public TreeNode helper(int[] preorder,int prelow,int prehi, int[] inorder,int inlow,int inhigh){
        if(prelow>prehi) return null;
        TreeNode root = new TreeNode(preorder[prelow]);
        int i=inlow;
        while(inorder[i] != preorder[prelow]) i++;
        int left = i-inlow;
        root.left = helper(preorder,prelow+1,prelow+left,inorder,inlow,i-1);
        root.right = helper(preorder,prelow+left+1,prehi,inorder,i+1,inhigh);
        return root;
    }
}