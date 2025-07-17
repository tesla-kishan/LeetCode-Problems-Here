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
    public void inorder(TreeNode root , List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
    public void recover(TreeNode root , List<Integer> sorted, int idx[]){
        if(root==null) return;
        recover(root.left,sorted,idx);
        root.val = sorted.get(idx[0]);
        idx[0]++;
        recover(root.right,sorted,idx);
    }
    public void recoverTree(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        Collections.sort(ans);
        recover(root,ans,new int[1]);
    }

}