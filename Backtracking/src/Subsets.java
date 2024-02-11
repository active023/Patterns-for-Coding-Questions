import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List <List<Integer>> results = new ArrayList<>();
        backtrack( results,  new ArrayList<>(),nums, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> tempList, int[] nums, int start) {
        results.add(new ArrayList<>(tempList));
        for(int i = start; i< nums.length; i++){
            tempList.add(nums[i]);
            backtrack(results, tempList, nums, i+1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
