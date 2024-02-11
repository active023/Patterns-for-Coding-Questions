import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(results, new ArrayList<>(), nums, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, ArrayList<Integer> tmplist, int[] nums, int start) {
        results.add(new ArrayList<>(tmplist));
        for(int i = start; i< nums.length; i++){
            if(i>start && nums[i]==nums[i-1]){
                continue;
            }
            tmplist.add(nums[i]);
            backtrack(results, tmplist, nums, i+1);
            tmplist.remove(tmplist.size()-1);
        }
    }
}
