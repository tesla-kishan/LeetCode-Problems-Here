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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        q.add(root);
        int lev = 1;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            while(size-- >0){
                TreeNode front = q.poll();
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
                temp.add(front.val);
            }
            if(lev%2 !=0) ans.add(temp);
            else{
                //reverser kro
                int i=0 ;
                int j=temp.size()-1;
                while(i<j){
                    int x = temp.get(i);
                    temp.set(i,temp.get(j));
                    temp.set(j,x);
                    i++;
                    j--;
                }
                ans.add(temp);
            }
            lev++;
        }
        return ans;
    }
}