import java.util.Arrays;

public class ReplaceArrayElements {

    public static void main(String[] args) {
        int[] arr = {8, 9, 5, 11, 6, 1, 7, 6};
        new ReplaceArrayElements().replace(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void replace(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                arr[i] = -1;
            } else {
                arr[i] = max;
            }
        }
    }
}
