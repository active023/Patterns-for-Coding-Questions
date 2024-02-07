public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        int index = 0;
        int lastElement = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != lastElement) {
                nums[index] = nums[i];
                index++;
                lastElement = nums[i];
            }

        }

        return index == Integer.MIN_VALUE ? 0 : index;

    }
}
