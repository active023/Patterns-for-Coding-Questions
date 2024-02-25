import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> results = new ArrayList<>();
        dfs(root, results);
        return results.get(k - 1);
    }

    private void dfs(TreeNode root, List<Integer> results) {
        if (root == null) {
            return;
        }
        dfs(root.left, results);
        results.add(root.val);
        dfs(root.right, results);
    }
}
