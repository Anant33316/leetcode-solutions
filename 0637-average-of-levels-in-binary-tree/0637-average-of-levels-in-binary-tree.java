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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double>list = new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        list.add((double)root.val);
        while(!q.isEmpty()){
            double sum=0;
            int size = q.size();
            int count=0;
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                if(current.left!=null){
                sum+=(double)current.left.val;
                q.offer(current.left);
                count++;
                }
                if(current.right!=null){
                sum+=(double)current.right.val;
                q.offer(current.right);
                count++;
                }
            }
            if(count==0){
                break;
            }
            list.add(sum/count);
        }
        return list;
    }
}