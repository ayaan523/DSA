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
    public void dfs(TreeNode root, List<Integer>answer){
        if(root==null){
            return;
        }
        
        dfs(root.left,answer);
        answer.add(root.val);
        dfs(root.right,answer);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>answer=new ArrayList<>();
        dfs(root,answer);
        return answer;
    }
}