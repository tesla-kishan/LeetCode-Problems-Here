/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean left = contains(root.left,p);
        boolean right = contains(root.right,q);
        if((left && right) || (!left && !right)) return root;
        if(left && !right) return lowestCommonAncestor(root.left,p,q);
        if(!left && right) return lowestCommonAncestor(root.right,p,q);
        return root; //fn will not reach here
    }
    public boolean contains(TreeNode root, TreeNode node){
        if(root == null) return false;
        if(node==root) return true;
        return contains(root.left,node) || contains(root.right,node);
    }
}