public class ValidateTree {

    public boolean isValidBST(TreeNode root) {
        return checker(root, null, null);
    }

    public boolean checker(TreeNode root, Integer min, Integer max) {

        System.out.println("root.val " + root.val + " min " + min + " max " + max);
        if (root == null) return true;

        if ((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;

        return checker(root.left, min, root.val) && checker(root.right, root.val, max);
    }
}
