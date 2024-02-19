import java.util.*;

public class ZigZagOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean left = true;
        while (!queue.isEmpty()) {
            int level = queue.size();
            System.out.println(level);
            int[] currentLevel = new int[level];
            if (left) {
                for (int i = 0; i < level; i++) {
                    TreeNode currentNode = queue.poll();
                    currentLevel[i] = currentNode.val;
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                left = false;
            } else {
                for (int i = level - 1; i >= 0; i--) {
                    TreeNode currentNode = queue.poll();
                    currentLevel[i] = currentNode.val;
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                }
                left = true;
            }
            results.add(Arrays.stream(currentLevel).boxed().toList());
        }
        return results;
    }
}
