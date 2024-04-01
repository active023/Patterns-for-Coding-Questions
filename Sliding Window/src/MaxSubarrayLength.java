import java.util.HashMap;

public class MaxSubarrayLength {

    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int currentCount = 0;
        int maxCount = 0;

        for (int right = 0; right < nums.length; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            while (left < right && freq.get(nums[right]) > k) {
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }
            currentCount = right - left + 1;
            maxCount = Math.max(currentCount, maxCount);
        }
        return maxCount;
    }
}
