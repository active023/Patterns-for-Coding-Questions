import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {

    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>((elem1, elem2) -> elem1 - elem2);
        for (int num : nums) {
            queue.offer(num);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        return queue.peek();
    }
}
