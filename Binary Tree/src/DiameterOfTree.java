public class DiameterOfTree {

    public int diameterOfBinaryTree(TreeNode root) {
        int[] ans = new int[1];
        dfs(root, ans);
        return ans[0];
    }

    private int dfs(TreeNode root, int[] ans) {
        if (root == null) {
            return 0;
        }

        int l = dfs(root.left, ans);
        int r = dfs(root.left, ans);
        ans[0] = Math.max(ans[0], l + r);

        return 1 + Math.max(l, r);
    }
}
