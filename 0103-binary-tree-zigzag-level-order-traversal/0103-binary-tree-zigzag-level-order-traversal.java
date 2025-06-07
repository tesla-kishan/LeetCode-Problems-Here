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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        int level =0;
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = q.size();
            while(size-- >0){
                TreeNode t = q.poll();
                temp.add(t.val);
                if(t.left != null) q.add(t.left);
                if(t.right != null) q.add(t.right);
            }
            if(level %2 == 0) ans.add(temp);
            else{
                //reverse
                int i = 0;
                int j = temp.size()-1;
                while(i<j){
                    int rr = temp.get(i);
                    temp.set(i,temp.get(j));
                    temp.set(j,rr);
                    i++;
                    j--;
                }
                ans.add(temp);
            }
            level++;
        }
        return ans;
    }
}