import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        new MergeArrays().merge(nums1, m, nums2, n);

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];

        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (m > idx1) {
                if (n > idx2) {
                    if (nums1[idx1] > nums2[idx2]) {
                        arr[i] = nums2[idx2];
                        idx2++;
                    } else {
                        arr[i] = nums1[idx1];
                        idx1++;
                    }

                } else {
                    arr[i] = nums1[idx1];
                    idx1++;
                }
            } else {
                arr[i] = nums2[idx2];
                idx2++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
