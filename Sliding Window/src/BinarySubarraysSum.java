public class BinarySubarraysSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        for (right = 0; right < nums.length; right++) {
            sum += nums[right];
            if (sum == goal) {
                count++;
                sum -= nums[left];
                left++;
            }
        }
        return count;

    }
}
