import java.util.PriorityQueue;
import java.util.Queue;

public class SlidingWindowMax {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Queue<Integer> queue = new PriorityQueue<>((e1, e2) -> e2 - e1);
        int[] results = new int[nums.length - k + 1];
        int current = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            queue.add(nums[right]);

        }
        return results;
    }
}
