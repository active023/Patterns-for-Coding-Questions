public class FindPeakElement {

    public int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        long leftV;
        long rightV;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            leftV = (mid - 1 < 0) ? Long.MIN_VALUE : nums[mid - 1];
            rightV = (mid + 1 > nums.length - 1) ? Long.MIN_VALUE : nums[mid + 1];
            if (nums[mid] > leftV && nums[mid] > rightV) {
                return mid;
            } else if (nums[mid] < leftV) {
                end = end - 1;
            } else if (nums[mid] < rightV) {
                start = start + 1;
            }

        }
        return -1;
    }


}
