import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(results, nums[i], i + 1, nums);
        }
        return results;
    }

    private void twoSum(List<List<Integer>> results, int target, int start, int[] nums) {
        int left = start;
        int right = nums.length - 1;
        while (left < right) {
            if (target + nums[left] + nums[right] == 0) {
                results.add(List.of(target, nums[left], nums[right]));
                // Skip duplicate elements for left
                while (left < right && nums[left] == nums[left + 1]) {
                    left++;
                }

                // Skip duplicate elements for right
                while (left < right && nums[right] == nums[right - 1]) {
                    right--;
                }
                left++;
                right--;
            } else if (target + nums[left] + nums[right] > 0) {
                right--;
            } else {
                left++;
            }
        }
    }
}
