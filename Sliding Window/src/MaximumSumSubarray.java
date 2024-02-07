public class MaximumSumSubarray {

    public int findMaxSumSubArray(int k, int[] arr) {

        int sum = Integer.MIN_VALUE;
        int current = 0;

        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k > 0) {
                current = current + arr[i];
                k--;
            } else {
                current = current + arr[i] - arr[left++];
            }
            sum = Math.max(sum, current);
        }

        return sum;
    }
}
