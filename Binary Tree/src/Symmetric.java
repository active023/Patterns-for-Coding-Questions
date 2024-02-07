public class Symmetric {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {

            return true;
        }


        return isMirror(root.left, root.right);

    }

    public boolean isMirror(TreeNode l, TreeNode r) {

        if (l == null && r == null) {
            return true;
        }

        if (l == null && r != null) {
            return false;
        }

        if (r == null && l != null) {
            return false;
        }
        if (l.val != r.val) {
            return false;
        }

        return isMirror(l.left, r.right) && isMirror(l.right, r.left);
    }
}
