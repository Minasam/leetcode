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
    public void swapNodes(TreeNode current){
        if(current == null){
            return;
        }
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
        swapNodes(current.left);
        swapNodes(current.right);
    }
    
    public TreeNode invertTree(TreeNode root) {
        swapNodes(root);
        return root;
    }
}