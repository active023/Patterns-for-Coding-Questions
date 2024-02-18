import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            double avg = 0;
            for (int i = 0; i < level; i++) {
                TreeNode currentNode = queue.poll();
                avg = avg + currentNode.val;
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            results.add(avg / level);
        }

        return results;
    }
}
