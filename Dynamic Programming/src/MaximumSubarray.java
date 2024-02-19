public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int bestMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            bestMax = Math.max(currentMax, bestMax);
        }
        return bestMax;
    }
}
