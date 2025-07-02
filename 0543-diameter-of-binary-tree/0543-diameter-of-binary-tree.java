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
    class Result {
        int val = 0;
    }

    public int height(TreeNode root, Result ans) {
        if (root == null) return 0;
        int left = height(root.left, ans);
        int right = height(root.right, ans);
        int path = left + right;
        ans.val = Math.max(ans.val, path);
        return Math.max(left, right) + 1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Result ans = new Result();
        height(root, ans);
        return ans.val;
    }
}