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
    public boolean isCousins(TreeNode root, int x, int y) {
        int l =0;
        int lx= -1;
        int ly= -2;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- >0){
                TreeNode temp = q.poll();
                if(temp.val == x){
                    lx= l;
                }
                if(temp.val == y){
                    ly= l;
                }
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
            }
            if(lx == ly){
                return !fn(root,x,y);
            }
            l++;
        }
        return false;
    }
    public boolean fn(TreeNode root , int x , int y){
        if(root == null) return false;
        if(root.left != null && root.right != null){
            if(root.left.val == x && root.right.val == y)  return true;
            if(root.right.val == x && root.left.val == y)  return true;
        }
        boolean left = fn(root.left,x,y);
        boolean right = fn(root.right,x,y);
        return left || right;
    }
}