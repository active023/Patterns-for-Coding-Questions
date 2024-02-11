public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};

        System.out.println(new MaximumSubArray().findMaxAverage(nums, 4));
    }
    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        int i = 0;
        double maxAvg = Integer.MIN_VALUE;
        double runningTotal = 0;
        while(j<nums.length){
            runningTotal = runningTotal + nums[j];
            if (k <= j - i + 1) {
                if (k == j - i + 1) {
                    maxAvg = Math.max(maxAvg, runningTotal / k);
                } else {
                    runningTotal = runningTotal - nums[i];
                    maxAvg = Math.max(maxAvg, runningTotal / k);
                    i++;
                }
            }
            j++;
        }
      return maxAvg;
    }
}
