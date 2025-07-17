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
    public void recoverTree(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev = null;
        TreeNode prevprev = null;
        List<TreeNode> ans = new ArrayList<>();
        while(curr != null){
            if(curr.left !=null){
                TreeNode pred = curr.left;
                while(pred.right !=null && pred.right !=curr){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right = curr;
                    curr = curr.left;
                }
                else{ //pred.right == curr
                    pred.right=null;
                    if(prev!=null && prevprev !=null){
                        if(prev.val<prevprev.val && prev.val<curr.val) ans.add(prev);
                        if(prev.val>prevprev.val && prev.val>curr.val) ans.add(prev);
                    }
                    else if(prev!=null && prev.val>curr.val) ans.add(prev);
                    prevprev=prev;
                    prev=curr;
                    curr = curr.right;
                }
            }
            else{ //pred hai hi nhi
                if(prev!=null && prevprev!=null){
                    if(prev.val>prevprev.val && prev.val>curr.val) ans.add(prev);
                    if(prev.val<curr.val && prev.val<prevprev.val) ans.add(prev);
                }
                else if(prev!=null && prev.val>curr.val) ans.add(prev);
                prevprev=prev;
                prev=curr;
                curr=curr.right;
            }
        }
        if(prev.val<prevprev.val) ans.add(prev);
        TreeNode first = ans.get(0);
        TreeNode second = ans.get(ans.size()-1);
        int temp = first.val;
        first.val = second.val;
        second.val=temp;

    }
}