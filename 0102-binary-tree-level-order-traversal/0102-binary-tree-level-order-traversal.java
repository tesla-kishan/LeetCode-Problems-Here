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
    public int height(TreeNode root){
        if(root==null || (root.left == null && root.right ==null)) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public void nthlev(TreeNode root ,List<Integer>temp , int n){
        if (root==null) return;
        if(n==1){
            temp.add(root.val);
            return;
        }
        nthlev(root.left,temp,n-1);
        nthlev(root.right,temp,n-1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root ==null) return ans;
        int levels = height(root)+1;
        for(int i=1 ; i<=levels ; i++){
            List<Integer> temp = new ArrayList<>();
            nthlev(root,temp,i);
            ans.add(temp);
        }
        return ans;
    }
}