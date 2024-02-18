import java.util.Arrays;

public class EvenEntries {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 5, 6, 7};
        System.out.println(Arrays.toString(new EvenEntries().sort(arr)));

    }

    public int[] sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] % 2 == 0) {
                left++;
            } else {
                swap(arr, left, right);
                right--;
            }
        }

        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}
