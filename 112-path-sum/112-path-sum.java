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
   boolean first = true;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        targetSum -= root.val;
        
         if(root.left == null && root.right == null){
            return targetSum == 0;
        }
        
    
        boolean res = false;
        if(root.left != null)  {
            res |= hasPathSum(root.left, targetSum);
        }
        if(root.right != null){
            res |= hasPathSum(root.right, targetSum);
        }
        System.out.println(res+" "+targetSum);
        return res;
    }
}