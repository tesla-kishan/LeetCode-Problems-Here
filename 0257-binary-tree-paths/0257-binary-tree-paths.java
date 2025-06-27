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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        fn(ans,root,"");
        return ans;
    }
    public void fn(List<String> ans, TreeNode root , String s){
        if(root ==null) return;
        if(root.left == null && root.right == null){
            ans.add(s+root.val);
            return;
        }
        fn(ans,root.left,s+root.val+"->");
        fn(ans,root.right,s+root.val+"->");
    }
}