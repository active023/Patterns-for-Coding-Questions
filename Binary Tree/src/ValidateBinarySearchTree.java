public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.right != null && root.right.val < root.val) {
            return false;
        }
        if (root.left != null && root.left.val > root.val) {
            return false;
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }
}
