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
    public void nthlev(TreeNode root , List<Integer> temp , int n){
        if(root == null) return;
        if(n==1){
            temp.add(root.val);
            return;
        }
        nthlev(root.left,temp,n-1);
        nthlev(root.right,temp,n-1);

    }
    public void nthlev2(TreeNode root , List<Integer> temp , int n){
        if(root == null) return;
        if(n==1){
            temp.add(root.val);
            return;
        }
        nthlev2(root.right,temp,n-1);
        nthlev2(root.left,temp,n-1);

    }
    public int height(TreeNode root){
        if(root == null || (root.left==null && root.right==null)) return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        int level = height(root)+1;
        for(int i=1 ; i<=level ; i++){
            List<Integer> temp = new ArrayList<>();
            if(i%2 !=0) nthlev(root,temp,i);
            else nthlev2(root,temp,i);
            ans.add(temp);
        }
        return ans;
    }
}