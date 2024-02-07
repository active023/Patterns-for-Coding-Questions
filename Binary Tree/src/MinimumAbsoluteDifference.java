import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifference {

    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrderBinarySearch(root, list);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int currentDiff = list.get(i) - list.get(i - 1);
            min = Math.min(currentDiff, min);
        }
        return min;
    }

    public void inOrderBinarySearch(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            inOrderBinarySearch(root.left, list);
        }
        list.add(root.val);
        if (root.right != null) {
            inOrderBinarySearch(root.right, list);
        }
    }
}
