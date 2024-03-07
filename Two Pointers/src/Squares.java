public class Squares {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] sqr = new int[nums.length];
        int i = nums.length - 1;
        while (left < right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if (leftSq > rightSq) {
                sqr[i] = leftSq;
                left++;
            } else {
                sqr[i] = rightSq;
                right--;
            }
            i--;
        }
        if (left == right) {
            sqr[i] = nums[left] * nums[left];
        }
        return sqr;
    }
}
