public class HouseRobber2 {

    public int rob(int[] nums) {
        int[] dp1 = new int[nums.length - 1];
        dp1[0] = nums[0];
        dp1[1] = Math.max(dp1[0], dp1[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + i);
        }
        int[] dp2 = new int[nums.length - 1];
        dp2[0] = nums[1];
        dp2[1] = Math.max(dp2[1], dp2[2]);

        for (int i = 2; i < nums.length; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + i);
        }
        return Math.max(dp1[dp1.length - 1], dp2[dp2.length - 1]);
    }
}
