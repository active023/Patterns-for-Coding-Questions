import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> results = new ArrayList<>();
        sum(results, root, targetSum, new ArrayList<>());
        return results;
    }

    private void sum(List<List<Integer>> results, TreeNode root, int targetSum, List<Integer> sumTracker) {
        if (root == null) {
            return;
        }
        sumTracker.add(root.val);
        if (root.left == null && root.right == null && root.val == targetSum) {
            results.add(new ArrayList<>(sumTracker));
        } else {
            sum(results, root.left, targetSum - root.val, sumTracker);
            sum(results, root.right, targetSum - root.val, sumTracker);
        }
        sumTracker.removeLast();
    }
}
