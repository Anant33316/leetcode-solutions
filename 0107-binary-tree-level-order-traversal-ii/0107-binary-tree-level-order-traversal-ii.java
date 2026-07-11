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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>>list = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        if(root==null){
            return list;
        }
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer>list1 = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                list1.add(current.val);
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                }
            }
            list.add(list1);
        }
        Collections.reverse(list);
        return list;
    }
}