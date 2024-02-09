public class MoveZeroes {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int nonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (nonZero != i) {
                    nums[nonZero] = nums[i];
                    nums[i] = 0;
                }

                nonZero++;
            }
        }
    }
}
