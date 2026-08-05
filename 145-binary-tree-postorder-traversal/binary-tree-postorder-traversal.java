class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> answer = new ArrayList<>();

        dfs(root, answer);

        return answer;
    }

    public void dfs(TreeNode root,
                    List<Integer> answer) {

        if (root == null) {
            return;
        }

        dfs(root.left, answer);

        dfs(root.right, answer);

        answer.add(root.val);
    }
}