import java.util.LinkedList;
import java.util.Queue;

public class MaxConsecutiveOnes {
    //LC1004

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 0, 0};

        System.out.println(new MaxConsecutiveOnes().longestOnes(nums, 0));
    }

    public int longestOnes(int[] nums, int k) {

        int max = Integer.MIN_VALUE;
        Queue<Integer> tracker = new LinkedList<>();
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (tracker.size() < k) {
                    tracker.add(i);
                } else {
                    if (tracker.isEmpty()) {
                        left = i + 1;
                    } else {
                        left = tracker.poll() + 1;
                        tracker.add(i);
                    }
                }
            }
            max = Math.max(i + 1 - left, max);
        }
        return max;
    }
}
