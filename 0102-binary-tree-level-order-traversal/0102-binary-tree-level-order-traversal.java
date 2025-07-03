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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        if(root !=null) q.add(root);
        while(!q.isEmpty()){
            List<Integer> tempo = new ArrayList<>();
            int x = q.size();
            while(x-- >0){
                TreeNode temp = q.poll();
                if(temp.left !=null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
                tempo.add(temp.val);

            }
            ans.add(tempo);
        }
        return ans;
    }
}