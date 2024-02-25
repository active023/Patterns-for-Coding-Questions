public class MaxDepth {

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int ans = 1;
        int left = 0;
        int right = 0;

        if (root.left != null) {
            left = maxDepth(root.left);
        }

        if (root.right != null) {
            right = maxDepth(root.right);
        }

        return ans + Math.max(left, right);

    }
}
