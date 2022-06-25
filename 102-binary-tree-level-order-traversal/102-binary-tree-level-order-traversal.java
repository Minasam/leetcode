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
        int currentLevel = 0;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> current = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> levelQueue = new LinkedList<Integer>();
        queue.add(root);
        levelQueue.add(0);
        while(!queue.isEmpty()){
            TreeNode c = queue.remove();
            int level = levelQueue.remove();
            if(c== null){
                continue;
            }
            
            if(level == currentLevel){
                current.add(c.val);
            }else{
                res.add(current);
                current = new ArrayList<>();
                 current.add(c.val);
                currentLevel = level;
            }
            
            queue.add(c.left);
            queue.add(c.right);
            levelQueue.add(level+1);
            levelQueue.add(level+1);
        }
        if(current.size()>0){
            res.add(current);
        }
        return res;
    }
}