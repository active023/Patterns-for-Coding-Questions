public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        int[] arr = new int[2];
        while (i < j) {
            int tmp = numbers[i] + numbers[j];
            if (target == tmp) {
                arr[0] = i + 1;
                arr[1] = j + 1;
                return arr;
            }
            if (target - tmp > 0) {
                i++;
            } else {
                j--;
            }

        }
        return arr;
    }
}
