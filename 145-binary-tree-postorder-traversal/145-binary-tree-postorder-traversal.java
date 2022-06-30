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
    LinkedList<Integer> list =new LinkedList<>();
    public void preOrder(TreeNode node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        preOrder(node.right);
        list.add(node.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        preOrder(root);
        return list;
    }
}