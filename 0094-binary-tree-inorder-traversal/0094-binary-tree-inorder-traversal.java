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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>  arr = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr){
                    pred = pred.right;
                }
                if(pred.right == null){ //connect pred with curr
                    pred.right = curr;
                    curr = curr.left;
                }
                if(pred.right==curr){ //unlink pred with curr
                    pred.right = null;
                    arr.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                arr.add(curr.val);
                curr = curr.right;
            }
        }
        return arr;
    }
}