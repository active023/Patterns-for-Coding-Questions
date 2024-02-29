import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class RightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if (i == 0) {
                    results.add(node.val);
                }
                if (node.right != null) {

                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
        }
        return results;
    }
}
