import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(new MissingNumber().missingNumber(arr));
    }

    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i || nums[i] >= nums.length) {
                i++;
            } else {
                int tmp = nums[nums[i]];
                nums[nums[i]] = nums[i];
                nums[i] = tmp;
            }
        }

        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] && nums[j] >= nums.length) {
                return j;
            }
        }
        return nums.length;
    }
}
