public class SmallestSubarrayWithGreaterSum {

    public static void main(String[] args) {
        int S = 7;
        int[] arr = {2, 1, 5, 2, 3, 2};
        System.out.println(new SmallestSubarrayWithGreaterSum().findMinSubArray(S, arr));
    }

    public int findMinSubArray(int S, int[] arr) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int runningSum = 0;
        for (int i = 0; i < arr.length; i++) {
            runningSum = runningSum + arr[i];
            while (S <= runningSum) {
                min = Math.min(min, i - left + 1);
                runningSum = runningSum - arr[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
