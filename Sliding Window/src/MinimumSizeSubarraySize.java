public class MinimumSizeSubarraySize {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(new MinimumSizeSubarraySize().minSubArrayLen(7, nums));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int curr = 0;
        int ans = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            curr += nums[right];
            while (curr >= target) {
                ans = Math.min(ans, right - left + 1);
                curr = curr - nums[left];
                left++;
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
