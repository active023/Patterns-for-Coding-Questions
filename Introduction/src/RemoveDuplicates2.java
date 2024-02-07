public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums) {

        int index = 0;

        int lastE = Integer.MIN_VALUE;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != lastE) {

                nums[index] = nums[i];
                index++;
                count = 1;
                lastE = nums[i];

            } else if (nums[i] == lastE && count < 2) {

                nums[index] = nums[i];
                index++;
                count++;
            }


        }
        return index;
    }
}
