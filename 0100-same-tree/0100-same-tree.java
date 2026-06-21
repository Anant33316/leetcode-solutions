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
    public void add(TreeNode p, TreeNode q,boolean[] result){
        if(p==null && q!=null){
            result[0] = false;
            return;
        }
        if(p!=null && q==null){
            result[0] = false;
            return;
        }
        if(p==null && q==null){
            return;
        }
        if(p.val!=q.val){
            result[0]=false;
        }
        add(p.left,q.left,result);
        add(p.right,q.right,result);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] result = {true};
        add(p,q,result);
        return result[0];
    }
}