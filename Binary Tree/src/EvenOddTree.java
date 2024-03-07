import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {

    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean isOddNumber = true;
        TreeNode lastNode = null;

        while (!queue.isEmpty()) {
            int level = queue.size();
            for (int i = 0; i < level; i++) {
                TreeNode node = queue.poll();
                if (isOddNumber) {
                    if (node.val % 2 == 0) {
                        return false;
                    }
                    if (i > 0 && node.val >= lastNode.val) {
                        return false;
                    }
                } else {
                    if (node.val % 2 != 0) {
                        return false;
                    }
                    if (i > 0 && node.val <= lastNode.val) {
                        return false;
                    }
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                lastNode = node;
            }
            isOddNumber = !isOddNumber;
        }
        return true;
    }
}
