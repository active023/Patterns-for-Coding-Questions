import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifference {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> results = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();

        for (int j : nums1) {
            set1.add(j);
        }
        Set<Integer> set2 = new HashSet<>();

        for (int j : nums2) {
            set2.add(j);
        }

        List<Integer> numDiff1 = new ArrayList<>();

        set1.stream().forEach(j -> {
            if (!set2.contains(j)) {
                numDiff1.add(j);
            }
        });


        List<Integer> numDiff2 = new ArrayList<>();
        set2.stream().forEach(j -> {
            if (!set1.contains(j)) {
                numDiff2.add(j);
            }
        });

        results.add(new ArrayList<>(numDiff1));
        results.add(new ArrayList<>(numDiff2));
        return results;
    }
}
