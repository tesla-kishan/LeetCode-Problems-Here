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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        fn(root,ans,0);
        return ans;
    }
    public void fn(TreeNode root ,ArrayList<Integer> ans,int level){
        if(root == null) return;
        if(level == ans.size()){
            ans.add(root.val);
        }else{
            ans.set(level,Math.max(root.val , ans.get(level)));
        }
        fn(root.left,ans,level+1);
        fn(root.right,ans,level+1);

    }
}