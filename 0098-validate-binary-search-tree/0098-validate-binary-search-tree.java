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
    public boolean isValidBST(TreeNode root) {
        boolean flag=true;
        ArrayList<Integer>temp = new ArrayList<>();
        inorder(root,temp);
        for(int i=1 ; i<temp.size() ; i++){
            if(temp.get(i)<=temp.get(i-1))  flag=false;
        }
        return (flag==true);
    }
    public void inorder(TreeNode root,ArrayList<Integer>temp){
        if(root==null) return;
        inorder(root.left,temp);
        temp.add(root.val);
        inorder(root.right,temp);
        
    }
}