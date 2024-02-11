public class Squares {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = end; i >= 0; i--) {
            int sValue = nums[start] * nums[start];
            int eValue = nums[end] * nums[end];
            if (sValue > eValue) {
                result[i] = sValue;
                start++;
            } else {
                result[i] = eValue;
                end--;
            }
        }
        return result;
    }
}
