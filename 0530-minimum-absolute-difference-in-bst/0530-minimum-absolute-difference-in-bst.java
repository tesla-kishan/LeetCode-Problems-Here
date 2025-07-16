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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < ans.size(); i++) {
            minDiff = Math.min(minDiff, ans.get(i) - ans.get(i-1));
        }
        return minDiff;
        
    }
    public void inorder(TreeNode root ,List<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }
}