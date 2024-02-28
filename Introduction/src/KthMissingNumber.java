public class KthMissingNumber {

    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int lastNumber = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] - i - 1 < k) {
                count = arr[i] - i - 1;
                lastNumber = arr[i];
            } else {
                return lastNumber + k - count;
            }
            i++;
        }
        return arr[arr.length - 1] + k - count;
    }
}
